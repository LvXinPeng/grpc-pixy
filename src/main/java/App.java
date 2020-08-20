import com.csvw.lib.KafkaPixyServiceGrpc;
import com.csvw.lib.ProdRq;
import com.csvw.lib.ProdRs;
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

    public static void produceMsg(String cluster, String topic, String msg) {
        final Logger logger = Logger.getLogger(App.class.getName());
        //ManagedChannel channel = ManagedChannelBuilder.forTarget("10.122.70.102:19091").usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forAddress(targetHost, targetPort).usePlaintext().build();
        logger.info(channel.toString());
        KafkaPixyServiceGrpc.KafkaPixyServiceStub stub = KafkaPixyServiceGrpc.newStub(channel);
        logger.info(stub.toString());

        ByteString bytesMsg = ByteString.copyFromUtf8(msg);
        ProdRq rq = ProdRq.newBuilder().setCluster(cluster).setTopic(topic).setMessage(bytesMsg)
                .setKeyUndefined(true).setAsyncMode(true).build();
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

    public static void main(String[] args) {

        String cluster = "default_cluster";
        String topic = "kafka-pixy";
        String msg = "hellokafkapixy";

        produceMsg(cluster, topic, msg);

    }
}
