package com.csvw;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import mailgun.kafkapixy.*;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 创建一个Kafka Pixy Client客户端对象
 */
public class KafkaPixyClient {
    private final Logger logger = Logger.getLogger(KafkaPixyClient.class.getName());

    private KafkaPixyGrpc.KafkaPixyBlockingStub stub;
    private KafkaPixyGrpc.KafkaPixyStub stubAsync;
    private Boolean isAsync;

    public KafkaPixyClient(String target) {

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        this.stub = KafkaPixyGrpc.newBlockingStub(channel);
    }

    public KafkaPixyClient(String target, Boolean isAsync) {

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        this.stubAsync = KafkaPixyGrpc.newStub(channel);
        this.isAsync = isAsync;
    }


    /**
     * 同步发送消息
     *
     * @param cluster
     * @param topic
     * @param msg
     * @param isPartitionedByHash 消息是否哈希分区
     */
    public void produceMsg(String cluster, String topic, String msg, Boolean isPartitionedByHash) {

        RecordHeader recordHeader = RecordHeader.newBuilder().build();
        ByteString bytesMsg = ByteString.copyFromUtf8(msg);
        ProdRq rq = ProdRq.newBuilder()
                .setCluster(cluster)
                .setTopic(topic)
                .setMessage(bytesMsg)
                .setKeyUndefined(!isPartitionedByHash)
                .setAsyncMode(false)
                .addHeaders(recordHeader)
                .build();
        logger.info("Client sending {" + rq.toString() + "}");

        try {
            stub.produce(rq);
            System.out.println(stub.produce(rq));
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    /**
     * 异步发送消息
     *
     * @param cluster
     * @param topic
     * @param msg
     * @param isPartitionedByHash 消息是否哈希分区
     */
    public void produceMsgAsync(String cluster, String topic, String msg, Boolean isPartitionedByHash) {

        RecordHeader recordHeader = RecordHeader.newBuilder().build();
        ByteString bytesMsg = ByteString.copyFromUtf8(msg);
        ProdRq rq = ProdRq.newBuilder()
                .setCluster(cluster)
                .setTopic(topic)
                .setMessage(bytesMsg)
                .setKeyUndefined(!isPartitionedByHash)
                .setAsyncMode(true)
                .addHeaders(recordHeader)
                .build();
        logger.info("Client sending {" + rq.toString() + "}");
        StreamObserver<ProdRs> rsStreamObserver = new StreamObserver<ProdRs>() {

            @Override
            public void onNext(ProdRs prodRs) {
                long offset = prodRs.getOffset();
                int partition = prodRs.getPartition();
                logger.info("offset:" + String.valueOf(offset));
                logger.info("partition:" + String.valueOf(partition));
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning("produceMsgAsync error ------");
            }

            @Override
            public void onCompleted() {
                logger.info("produceMsgAsync complete ------");
            }
        };
        try {
            stubAsync.produce(rq, rsStreamObserver);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    /**
     * 获取kafka-pixy代理下某个集群所有的topic
     *
     * @param cluster
     * @param isWithPartitions topic信息是否带元数据(分区信息)
     * @return
     */
    public Map<String, GetTopicMetadataRs> listTopics(String cluster, Boolean isWithPartitions) {

        ListTopicRq topicRq = ListTopicRq.newBuilder()
                .setCluster(cluster)
                .setWithPartitions(isWithPartitions)
                .build();

        try {
            ListTopicRs listTopicRs = stub.listTopics(topicRq);
            return listTopicRs.getTopicsMap();

        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
    }

}
