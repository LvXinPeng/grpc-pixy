import com.csvw.lib.*;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {


    private static String targetHost = "10.122.70.102";
    private static int targetPort = 19091;

    private static void produceMsg(String cluster, String topic, String msg) {
        final Logger logger = Logger.getLogger(App.class.getName());
        //ManagedChannel channel = ManagedChannelBuilder.forTarget("10.122.70.102:19091").usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(targetHost, targetPort).usePlaintext().build();
        logger.info(channel.toString());
        KafkaPixyServiceGrpc.KafkaPixyServiceStub stub = KafkaPixyServiceGrpc.newStub(channel);
        logger.info(stub.toString());

        ByteString bytesMsg = ByteString.copyFromUtf8(msg);
        ProdRq rq = ProdRq.newBuilder()
                .setCluster(cluster)
                .setTopic(topic)
                .setMessage(bytesMsg)
                .setKeyUndefined(true)
                .setAsyncMode(true)
                .build();
        logger.info(rq.toString());

        StreamObserver<ProdRs> rsStreamObserver = new StreamObserver<ProdRs>() {
            @Override
            public void onNext(ProdRs prodRs) {
                long offset = prodRs.getOffset();
                int partition = prodRs.getPartition();
                logger.info("next ------");
                logger.info(String.valueOf(offset));
                logger.info(String.valueOf(partition));
            }

            @Override
            public void onError(Throwable throwable) {
                logger.info("error ------");
            }

            @Override
            public void onCompleted() {
                logger.info("complete ------");
            }
        };
        stub.produce(rq, rsStreamObserver);
    }

    private static void listTopicSet(String cluster) {
        final Logger logger = Logger.getLogger(App.class.getName());
        //ManagedChannel channel = ManagedChannelBuilder.forTarget("10.122.70.102:19091").usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(targetHost, targetPort).usePlaintext().build();
        logger.info(channel.toString());
        KafkaPixyServiceGrpc.KafkaPixyServiceStub stub = KafkaPixyServiceGrpc.newStub(channel);

        ListTopicRq topicRq = ListTopicRq.newBuilder().setCluster(cluster).build();
        StreamObserver<ListTopicRs> topicRsStreamObserver = new StreamObserver<ListTopicRs>() {
            @Override
            public void onNext(ListTopicRs listTopicRs) {

                logger.info("next ------");
                logger.info(String.valueOf(listTopicRs.getTopicsCount()));
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };

        stub.listTopics(topicRq, topicRsStreamObserver);
    }

    public static void main(String[] args) {

        String cluster = "default";
        String cluster2 = "10.160.242.166:9092";
        String topic = "kafka-pixy2";
        String msg = "hellokafkapixy";

        produceMsg(cluster, topic, msg);

        listTopicSet(cluster2);
    }
}
