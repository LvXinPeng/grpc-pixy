import com.csvw.KafkaPixyClient;

/**
 * Hello Kafka-pixy!
 */
public class App {


    public static void main(String[] args) {

        String target = "10.122.70.102:19091";
        String cluster = "default";
        String topic = "kafka-pixy";
        String topicAsync = "kafka-pixy2";
        String msg = "hello kafka pixy-------sync------";
        String msgAsync = "hello kafka pixy-------async------";

        // 客户端同步发送消息
        KafkaPixyClient client = new KafkaPixyClient(target);
        client.produceMsg(cluster, topic, msg, true);
        client.listTopics(cluster, false);

        // 客户端异步发送消息
        KafkaPixyClient clientAsync = new KafkaPixyClient(target, true);
        clientAsync.produceMsgAsync(cluster, topic, msgAsync, true);


    }
}
