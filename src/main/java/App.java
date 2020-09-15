import com.csvw.KafkaPixyClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.*;

/**
 * Hello Kafka-pixy!
 */
public class App {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String target = "10.122.70.102:19091";
        String cluster = "default";
        String topic = "kafka-pixy";
        String topicAsync = "kafka-pixy2";
        String msg = "hello kafka pixy-------sync------";
        String msgAsync = "hello kafka pixy-------async------";

        // 客户端同步发送消息
        KafkaPixyClient client = new KafkaPixyClient(target);
//        client.produceMsg(cluster, topic, msg, true);
//        Map<String, GetTopicMetadataRs> topics = client.listTopics(cluster, false);
//        System.out.println(topics);

        // 客户端异步发送消息
/*
        KafkaPixyClient clientAsync = new KafkaPixyClient(target, true);
        clientAsync.produceMsgAsync(cluster, topic, msgAsync, true);
*/
        Connection conn = getConn();
        PreparedStatement statement = conn.prepareStatement("select * from dw_tag_metadata");
        ResultSet resultSet = statement.executeQuery();

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            JSONObject jsonObj = new JSONObject();
            for (int col = 1; col <= columnCount; col++) {
                String columnName = metaData.getColumnLabel(col);
                String value = resultSet.getString(columnName);
                try {
                    jsonObj.put(columnName, value);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println(jsonObj.toString());
            client.produceMsg(cluster, topic, jsonObj.toString(), true);
            /** TODO
             * kafka produce msg
             */
        }

        resultSet.close();
        statement.close();
        conn.close();

    }

    private static Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.hive.jdbc.HiveDriver");
        Connection connection = DriverManager.getConnection("jdbc:impala://10.122.44.113:21050/tmp;AuthMech=3;UID=scb;PWD=scb");

        return connection;
    }

    private static void resultSetToJson(ResultSet rs) throws SQLException, JSONException {

        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (rs.next()) {
            JSONObject jsonObj = new JSONObject();
            for (int col = 1; col <= columnCount; col++) {
                String columnName = metaData.getColumnLabel(col);
                String value = rs.getString(columnName);
                jsonObj.put(columnName, value);
            }
            System.out.println(jsonObj.toString());
            /** TODO
             * kafka produce msg
             */
        }
    }

}
