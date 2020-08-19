
import com.csvw.lib.*;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


/**
 * Hello world!
 */
public class App {



    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("10.122.70.102", 19091).usePlaintext().build();

        KafkaPixyServiceGrpc.KafkaPixyServiceStub stub = KafkaPixyServiceGrpc.newStub(channel);

        String cluster = "10.160.242.166:9092,10.160.242.253:9092,10.160.242.21:9092";
        String topic = "kafka-pixy";
        ByteString key = ByteString.copyFromUtf8("pixy");
        ByteString msg = ByteString.copyFromUtf8("hello kafkapixy");

        ProdRq rq = ProdRq.newBuilder().setCluster(cluster).setTopic(topic).setKeyValue(key).setMessage(msg).build();

        stub.produce(rq, new StreamObserver<ProdRs>() {
            @Override
            public void onNext(ProdRs prodRs) {
                System.out.println("next ------");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error ------");
            }

            @Override
            public void onCompleted() {
                System.out.println("complete ------");
            }
        });


    }
}
