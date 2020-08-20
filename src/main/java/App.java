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



    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(App.class.getName());
//        ManagedChannel channel = ManagedChannelBuilder.forTarget("10.122.70.102:19091").usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("10.122.70.102", 19091).usePlaintext().build();
        logger.info(channel.toString());
        KafkaPixyServiceGrpc.KafkaPixyServiceStub stub = KafkaPixyServiceGrpc.newStub(channel);

        logger.info(stub.toString());
        String cluster = "10.160.242.166:9092,10.160.242.253:9092,10.160.242.21:9092";
        String topic = "kafka-pixy";
        ByteString msg = ByteString.copyFromUtf8("hellokafkapixy");

        ProdRq rq = ProdRq.newBuilder().setCluster(cluster).setTopic(topic).setMessage(msg).setKeyUndefined(true).setAsyncMode(true).build();
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
}
