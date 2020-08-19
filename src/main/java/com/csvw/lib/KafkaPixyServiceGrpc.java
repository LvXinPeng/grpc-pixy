package com.csvw.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: kafkapixy.proto")
public final class KafkaPixyServiceGrpc {

  private KafkaPixyServiceGrpc() {}

  public static final String SERVICE_NAME = "KafkaPixyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.ProdRq,
      com.csvw.lib.ProdRs> getProduceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Produce",
      requestType = com.csvw.lib.ProdRq.class,
      responseType = com.csvw.lib.ProdRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.ProdRq,
      com.csvw.lib.ProdRs> getProduceMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.ProdRq, com.csvw.lib.ProdRs> getProduceMethod;
    if ((getProduceMethod = KafkaPixyServiceGrpc.getProduceMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getProduceMethod = KafkaPixyServiceGrpc.getProduceMethod) == null) {
          KafkaPixyServiceGrpc.getProduceMethod = getProduceMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.ProdRq, com.csvw.lib.ProdRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Produce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ProdRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ProdRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("Produce"))
              .build();
        }
      }
    }
    return getProduceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.ConsNAckRq,
      com.csvw.lib.ConsRs> getConsumeNAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsumeNAck",
      requestType = com.csvw.lib.ConsNAckRq.class,
      responseType = com.csvw.lib.ConsRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.ConsNAckRq,
      com.csvw.lib.ConsRs> getConsumeNAckMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.ConsNAckRq, com.csvw.lib.ConsRs> getConsumeNAckMethod;
    if ((getConsumeNAckMethod = KafkaPixyServiceGrpc.getConsumeNAckMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getConsumeNAckMethod = KafkaPixyServiceGrpc.getConsumeNAckMethod) == null) {
          KafkaPixyServiceGrpc.getConsumeNAckMethod = getConsumeNAckMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.ConsNAckRq, com.csvw.lib.ConsRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsumeNAck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ConsNAckRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ConsRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("ConsumeNAck"))
              .build();
        }
      }
    }
    return getConsumeNAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.AckRq,
      com.csvw.lib.AckRs> getAckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ack",
      requestType = com.csvw.lib.AckRq.class,
      responseType = com.csvw.lib.AckRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.AckRq,
      com.csvw.lib.AckRs> getAckMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.AckRq, com.csvw.lib.AckRs> getAckMethod;
    if ((getAckMethod = KafkaPixyServiceGrpc.getAckMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getAckMethod = KafkaPixyServiceGrpc.getAckMethod) == null) {
          KafkaPixyServiceGrpc.getAckMethod = getAckMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.AckRq, com.csvw.lib.AckRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.AckRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.AckRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("Ack"))
              .build();
        }
      }
    }
    return getAckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.GetOffsetsRq,
      com.csvw.lib.GetOffsetsRs> getGetOffsetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOffsets",
      requestType = com.csvw.lib.GetOffsetsRq.class,
      responseType = com.csvw.lib.GetOffsetsRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.GetOffsetsRq,
      com.csvw.lib.GetOffsetsRs> getGetOffsetsMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.GetOffsetsRq, com.csvw.lib.GetOffsetsRs> getGetOffsetsMethod;
    if ((getGetOffsetsMethod = KafkaPixyServiceGrpc.getGetOffsetsMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getGetOffsetsMethod = KafkaPixyServiceGrpc.getGetOffsetsMethod) == null) {
          KafkaPixyServiceGrpc.getGetOffsetsMethod = getGetOffsetsMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.GetOffsetsRq, com.csvw.lib.GetOffsetsRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOffsets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.GetOffsetsRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.GetOffsetsRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("GetOffsets"))
              .build();
        }
      }
    }
    return getGetOffsetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.SetOffsetsRq,
      com.csvw.lib.SetOffsetsRs> getSetOffsetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOffsets",
      requestType = com.csvw.lib.SetOffsetsRq.class,
      responseType = com.csvw.lib.SetOffsetsRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.SetOffsetsRq,
      com.csvw.lib.SetOffsetsRs> getSetOffsetsMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.SetOffsetsRq, com.csvw.lib.SetOffsetsRs> getSetOffsetsMethod;
    if ((getSetOffsetsMethod = KafkaPixyServiceGrpc.getSetOffsetsMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getSetOffsetsMethod = KafkaPixyServiceGrpc.getSetOffsetsMethod) == null) {
          KafkaPixyServiceGrpc.getSetOffsetsMethod = getSetOffsetsMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.SetOffsetsRq, com.csvw.lib.SetOffsetsRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOffsets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.SetOffsetsRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.SetOffsetsRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("SetOffsets"))
              .build();
        }
      }
    }
    return getSetOffsetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.ListTopicRq,
      com.csvw.lib.ListTopicRs> getListTopicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTopics",
      requestType = com.csvw.lib.ListTopicRq.class,
      responseType = com.csvw.lib.ListTopicRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.ListTopicRq,
      com.csvw.lib.ListTopicRs> getListTopicsMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.ListTopicRq, com.csvw.lib.ListTopicRs> getListTopicsMethod;
    if ((getListTopicsMethod = KafkaPixyServiceGrpc.getListTopicsMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getListTopicsMethod = KafkaPixyServiceGrpc.getListTopicsMethod) == null) {
          KafkaPixyServiceGrpc.getListTopicsMethod = getListTopicsMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.ListTopicRq, com.csvw.lib.ListTopicRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTopics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ListTopicRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ListTopicRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("ListTopics"))
              .build();
        }
      }
    }
    return getListTopicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.ListConsumersRq,
      com.csvw.lib.ListConsumersRs> getListConsumersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConsumers",
      requestType = com.csvw.lib.ListConsumersRq.class,
      responseType = com.csvw.lib.ListConsumersRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.ListConsumersRq,
      com.csvw.lib.ListConsumersRs> getListConsumersMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.ListConsumersRq, com.csvw.lib.ListConsumersRs> getListConsumersMethod;
    if ((getListConsumersMethod = KafkaPixyServiceGrpc.getListConsumersMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getListConsumersMethod = KafkaPixyServiceGrpc.getListConsumersMethod) == null) {
          KafkaPixyServiceGrpc.getListConsumersMethod = getListConsumersMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.ListConsumersRq, com.csvw.lib.ListConsumersRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConsumers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ListConsumersRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.ListConsumersRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("ListConsumers"))
              .build();
        }
      }
    }
    return getListConsumersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.csvw.lib.GetTopicMetadataRq,
      com.csvw.lib.GetTopicMetadataRs> getGetTopicMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopicMetadata",
      requestType = com.csvw.lib.GetTopicMetadataRq.class,
      responseType = com.csvw.lib.GetTopicMetadataRs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.csvw.lib.GetTopicMetadataRq,
      com.csvw.lib.GetTopicMetadataRs> getGetTopicMetadataMethod() {
    io.grpc.MethodDescriptor<com.csvw.lib.GetTopicMetadataRq, com.csvw.lib.GetTopicMetadataRs> getGetTopicMetadataMethod;
    if ((getGetTopicMetadataMethod = KafkaPixyServiceGrpc.getGetTopicMetadataMethod) == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        if ((getGetTopicMetadataMethod = KafkaPixyServiceGrpc.getGetTopicMetadataMethod) == null) {
          KafkaPixyServiceGrpc.getGetTopicMetadataMethod = getGetTopicMetadataMethod =
              io.grpc.MethodDescriptor.<com.csvw.lib.GetTopicMetadataRq, com.csvw.lib.GetTopicMetadataRs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTopicMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.GetTopicMetadataRq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.csvw.lib.GetTopicMetadataRs.getDefaultInstance()))
              .setSchemaDescriptor(new KafkaPixyServiceMethodDescriptorSupplier("GetTopicMetadata"))
              .build();
        }
      }
    }
    return getGetTopicMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KafkaPixyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KafkaPixyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KafkaPixyServiceStub>() {
        @java.lang.Override
        public KafkaPixyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KafkaPixyServiceStub(channel, callOptions);
        }
      };
    return KafkaPixyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KafkaPixyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KafkaPixyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KafkaPixyServiceBlockingStub>() {
        @java.lang.Override
        public KafkaPixyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KafkaPixyServiceBlockingStub(channel, callOptions);
        }
      };
    return KafkaPixyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KafkaPixyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KafkaPixyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KafkaPixyServiceFutureStub>() {
        @java.lang.Override
        public KafkaPixyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KafkaPixyServiceFutureStub(channel, callOptions);
        }
      };
    return KafkaPixyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KafkaPixyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void produce(com.csvw.lib.ProdRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ProdRs> responseObserver) {
      asyncUnimplementedUnaryCall(getProduceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void consumeNAck(com.csvw.lib.ConsNAckRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ConsRs> responseObserver) {
      asyncUnimplementedUnaryCall(getConsumeNAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public void ack(com.csvw.lib.AckRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.AckRs> responseObserver) {
      asyncUnimplementedUnaryCall(getAckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void getOffsets(com.csvw.lib.GetOffsetsRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.GetOffsetsRs> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOffsetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void setOffsets(com.csvw.lib.SetOffsetsRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.SetOffsetsRs> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOffsetsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listTopics(com.csvw.lib.ListTopicRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ListTopicRs> responseObserver) {
      asyncUnimplementedUnaryCall(getListTopicsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listConsumers(com.csvw.lib.ListConsumersRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ListConsumersRs> responseObserver) {
      asyncUnimplementedUnaryCall(getListConsumersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public void getTopicMetadata(com.csvw.lib.GetTopicMetadataRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.GetTopicMetadataRs> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopicMetadataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProduceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.ProdRq,
                com.csvw.lib.ProdRs>(
                  this, METHODID_PRODUCE)))
          .addMethod(
            getConsumeNAckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.ConsNAckRq,
                com.csvw.lib.ConsRs>(
                  this, METHODID_CONSUME_NACK)))
          .addMethod(
            getAckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.AckRq,
                com.csvw.lib.AckRs>(
                  this, METHODID_ACK)))
          .addMethod(
            getGetOffsetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.GetOffsetsRq,
                com.csvw.lib.GetOffsetsRs>(
                  this, METHODID_GET_OFFSETS)))
          .addMethod(
            getSetOffsetsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.SetOffsetsRq,
                com.csvw.lib.SetOffsetsRs>(
                  this, METHODID_SET_OFFSETS)))
          .addMethod(
            getListTopicsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.ListTopicRq,
                com.csvw.lib.ListTopicRs>(
                  this, METHODID_LIST_TOPICS)))
          .addMethod(
            getListConsumersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.ListConsumersRq,
                com.csvw.lib.ListConsumersRs>(
                  this, METHODID_LIST_CONSUMERS)))
          .addMethod(
            getGetTopicMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.csvw.lib.GetTopicMetadataRq,
                com.csvw.lib.GetTopicMetadataRs>(
                  this, METHODID_GET_TOPIC_METADATA)))
          .build();
    }
  }

  /**
   */
  public static final class KafkaPixyServiceStub extends io.grpc.stub.AbstractAsyncStub<KafkaPixyServiceStub> {
    private KafkaPixyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KafkaPixyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KafkaPixyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void produce(com.csvw.lib.ProdRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ProdRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProduceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public void consumeNAck(com.csvw.lib.ConsNAckRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ConsRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsumeNAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public void ack(com.csvw.lib.AckRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.AckRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void getOffsets(com.csvw.lib.GetOffsetsRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.GetOffsetsRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOffsetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public void setOffsets(com.csvw.lib.SetOffsetsRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.SetOffsetsRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOffsetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listTopics(com.csvw.lib.ListTopicRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ListTopicRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTopicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public void listConsumers(com.csvw.lib.ListConsumersRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.ListConsumersRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConsumersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public void getTopicMetadata(com.csvw.lib.GetTopicMetadataRq request,
        io.grpc.stub.StreamObserver<com.csvw.lib.GetTopicMetadataRs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopicMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KafkaPixyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KafkaPixyServiceBlockingStub> {
    private KafkaPixyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KafkaPixyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KafkaPixyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public com.csvw.lib.ProdRs produce(com.csvw.lib.ProdRq request) {
      return blockingUnaryCall(
          getChannel(), getProduceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public com.csvw.lib.ConsRs consumeNAck(com.csvw.lib.ConsNAckRq request) {
      return blockingUnaryCall(
          getChannel(), getConsumeNAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public com.csvw.lib.AckRs ack(com.csvw.lib.AckRq request) {
      return blockingUnaryCall(
          getChannel(), getAckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public com.csvw.lib.GetOffsetsRs getOffsets(com.csvw.lib.GetOffsetsRq request) {
      return blockingUnaryCall(
          getChannel(), getGetOffsetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public com.csvw.lib.SetOffsetsRs setOffsets(com.csvw.lib.SetOffsetsRq request) {
      return blockingUnaryCall(
          getChannel(), getSetOffsetsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public com.csvw.lib.ListTopicRs listTopics(com.csvw.lib.ListTopicRq request) {
      return blockingUnaryCall(
          getChannel(), getListTopicsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public com.csvw.lib.ListConsumersRs listConsumers(com.csvw.lib.ListConsumersRq request) {
      return blockingUnaryCall(
          getChannel(), getListConsumersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public com.csvw.lib.GetTopicMetadataRs getTopicMetadata(com.csvw.lib.GetTopicMetadataRq request) {
      return blockingUnaryCall(
          getChannel(), getGetTopicMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KafkaPixyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KafkaPixyServiceFutureStub> {
    private KafkaPixyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KafkaPixyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KafkaPixyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Produce writes a message to a Kafka topic.
     * If ProdReq.async_mode is false (default value) then the request will
     * block until the message is written to all ISR. In this case the respose
     * will contain the partition and offset of the message. This has to be
     * used to achive at-least-once deliverability guarantee.
     * If ProdReq.async_mode is true, then Kafka-Pixy returns immediately after
     * it gets the request and performs write on the backgroud. This mode
     * ensures highest throughput but messages can be lost, e.g. if the host
     * crashes before Kafka-Pixy has a chance to complete write.
     * Hash of ProdReq.key_value is used to determine a partition that the
     * message should be written to. If you want a message to go to an random
     * partition then set ProdReq.key_undefined to true. Note that if both
     * ProdReq.key_undefined and ProdReq.key_value are left default, which is
     * empty string and false respectively, then messages will be consitently
     * written to a partiticular partition selected by the hash of an empty
     * string.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.ProdRs> produce(
        com.csvw.lib.ProdRq request) {
      return futureUnaryCall(
          getChannel().newCall(getProduceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Consume reads a message from a topic and optionally acknowledges a
     * message previously consumed from the same topic.
     * Requests are performed in long polling fation, that is if all available
     * messages have been consumed then the request will block for
     * config.yaml:proxies.&lt;cluster&gt;.consumer.long_polling_timeout waiting for
     * new messages. If no new messages is produced while waiting the request
     * will return gRPC error with 408 status code.
     * To consume the first message set ConsNAckReq.no_ack to true, since there
     * is no message to acknowledge at this point. In the second and all
     * subsequent calls of the method set ConsNAckReq.ack_partition and
     * ConsNAckReq.ack_offset to the respective values of ConsRes returned by
     * the previous method call. To acknowledge the last consumed message before
     * teminating the application call Ack method.
     * If a message is not acknowledged within
     * config.yaml:proxies.&lt;cluster&gt;.consumer.ack_timeout the it will be returned
     * by Kafka-Pixy in ConsRes again possibly to another application.
     * If at-least-once delivery guarantee and retries are not desirable, then
     * you can set ConsNAckReq.auto_ack to true and Kafka-Pixy will acknowledge
     * messages automatically before returning them in ConsRes.
     * gRPC error codes:
     *  * Not Found (5): It just means that all message has been consumed and
     *    the long polling timeout has elaspsed. Just keep calling this method
     *    in a loop;
     *  * Resource Exhausted (8): too many consume requests. Either reduce the
     *    number of consuming threads or increase
     *    config.yaml:proxies.&lt;cluster&gt;.consumer.channel_buffer_size;
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     *  * Unavailable (14): the service is shutting down.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.ConsRs> consumeNAck(
        com.csvw.lib.ConsNAckRq request) {
      return futureUnaryCall(
          getChannel().newCall(getConsumeNAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Ack acknowledges a message earlier consumed from a topic.
     * This method is provided solely to acknowledge the last consumed message
     * before the application terminates. In all other cases ConsumeNAck should
     * be used.
     * gRPC error codes:
     *  * Invalid Argument (3): see the status description for details;
     *  * Internal (13): see the status description and logs for details;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.AckRs> ack(
        com.csvw.lib.AckRq request) {
      return futureUnaryCall(
          getChannel().newCall(getAckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetches partition offsets for the specified topic and group
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.GetOffsetsRs> getOffsets(
        com.csvw.lib.GetOffsetsRq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOffsetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets partition offsets for the specified topic and group.
     * NOTE: Although the request accepts the PartitionOffset object i
     * only 'Partition', 'Offset' and 'Metadata' are set by this method
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on offset request
     *  * NotFound (5): If the group and or topic does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.SetOffsetsRs> setOffsets(
        com.csvw.lib.SetOffsetsRq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOffsetsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all topics and metadata with optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.ListTopicRs> listTopics(
        com.csvw.lib.ListTopicRq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTopicsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all consumers of a topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.ListConsumersRs> listConsumers(
        com.csvw.lib.ListConsumersRq request) {
      return futureUnaryCall(
          getChannel().newCall(getListConsumersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetches topic metadata and optional metadata for the partitions of the topic
     * gRPC error codes:
     *  * Invalid Argument (3): If unable to find the cluster named in the request
     *  * Internal (13): If Kafka returns an error on request
     *  * NotFound (5): If the topic does not exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.csvw.lib.GetTopicMetadataRs> getTopicMetadata(
        com.csvw.lib.GetTopicMetadataRq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopicMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PRODUCE = 0;
  private static final int METHODID_CONSUME_NACK = 1;
  private static final int METHODID_ACK = 2;
  private static final int METHODID_GET_OFFSETS = 3;
  private static final int METHODID_SET_OFFSETS = 4;
  private static final int METHODID_LIST_TOPICS = 5;
  private static final int METHODID_LIST_CONSUMERS = 6;
  private static final int METHODID_GET_TOPIC_METADATA = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KafkaPixyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KafkaPixyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRODUCE:
          serviceImpl.produce((com.csvw.lib.ProdRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.ProdRs>) responseObserver);
          break;
        case METHODID_CONSUME_NACK:
          serviceImpl.consumeNAck((com.csvw.lib.ConsNAckRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.ConsRs>) responseObserver);
          break;
        case METHODID_ACK:
          serviceImpl.ack((com.csvw.lib.AckRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.AckRs>) responseObserver);
          break;
        case METHODID_GET_OFFSETS:
          serviceImpl.getOffsets((com.csvw.lib.GetOffsetsRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.GetOffsetsRs>) responseObserver);
          break;
        case METHODID_SET_OFFSETS:
          serviceImpl.setOffsets((com.csvw.lib.SetOffsetsRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.SetOffsetsRs>) responseObserver);
          break;
        case METHODID_LIST_TOPICS:
          serviceImpl.listTopics((com.csvw.lib.ListTopicRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.ListTopicRs>) responseObserver);
          break;
        case METHODID_LIST_CONSUMERS:
          serviceImpl.listConsumers((com.csvw.lib.ListConsumersRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.ListConsumersRs>) responseObserver);
          break;
        case METHODID_GET_TOPIC_METADATA:
          serviceImpl.getTopicMetadata((com.csvw.lib.GetTopicMetadataRq) request,
              (io.grpc.stub.StreamObserver<com.csvw.lib.GetTopicMetadataRs>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KafkaPixyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KafkaPixyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.csvw.lib.Kafkapixy.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KafkaPixyService");
    }
  }

  private static final class KafkaPixyServiceFileDescriptorSupplier
      extends KafkaPixyServiceBaseDescriptorSupplier {
    KafkaPixyServiceFileDescriptorSupplier() {}
  }

  private static final class KafkaPixyServiceMethodDescriptorSupplier
      extends KafkaPixyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KafkaPixyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KafkaPixyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KafkaPixyServiceFileDescriptorSupplier())
              .addMethod(getProduceMethod())
              .addMethod(getConsumeNAckMethod())
              .addMethod(getAckMethod())
              .addMethod(getGetOffsetsMethod())
              .addMethod(getSetOffsetsMethod())
              .addMethod(getListTopicsMethod())
              .addMethod(getListConsumersMethod())
              .addMethod(getGetTopicMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
