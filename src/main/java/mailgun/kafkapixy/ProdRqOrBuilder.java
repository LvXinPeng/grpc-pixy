// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

public interface ProdRqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProdRq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of a Kafka cluster to operate on.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <pre>
   * Name of a Kafka cluster to operate on.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * Name of a topic to produce to.
   * </pre>
   *
   * <code>string topic = 2;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * Name of a topic to produce to.
   * </pre>
   *
   * <code>string topic = 2;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Hash of the key is used to determine the partition to produce to. By
   * default it is an empty array which is a valid key, unless key_undefined
   * is set to true and then a random partition is selected.
   * </pre>
   *
   * <code>bytes key_value = 3;</code>
   * @return The keyValue.
   */
  com.google.protobuf.ByteString getKeyValue();

  /**
   * <pre>
   * If true then the message is written to a random partition, otherwise
   * hash of key_value is used to determine the partition.
   * </pre>
   *
   * <code>bool key_undefined = 4;</code>
   * @return The keyUndefined.
   */
  boolean getKeyUndefined();

  /**
   * <pre>
   * Message body.
   * </pre>
   *
   * <code>bytes message = 5;</code>
   * @return The message.
   */
  com.google.protobuf.ByteString getMessage();

  /**
   * <pre>
   * If true then the method returns immediately after Kafka-Pixy gets the
   * produce request, and the message is written to Kafka asynchronously.
   * In that case partition and offset returned in response should be ignored.
   * If false, then a response is returned in accordance with the
   * producer.required_acks parameter, that can be one of:
   *  * no_response:    the response is returned as soon as a produce request
   *                    is delivered to a partition leader Kafka broker.
   *  * wait_for_local: the response is returned as soon as data is written
   *                    to the disk by a partition leader Kafka broker.
   *  * wait_for_all:   the response is returned after all in-sync replicas
   *                    have data committed to disk.
   * </pre>
   *
   * <code>bool async_mode = 6;</code>
   * @return The asyncMode.
   */
  boolean getAsyncMode();

  /**
   * <pre>
   * Headers to include with the published message
   * </pre>
   *
   * <code>repeated .RecordHeader headers = 7;</code>
   */
  java.util.List<mailgun.kafkapixy.RecordHeader> 
      getHeadersList();
  /**
   * <pre>
   * Headers to include with the published message
   * </pre>
   *
   * <code>repeated .RecordHeader headers = 7;</code>
   */
  mailgun.kafkapixy.RecordHeader getHeaders(int index);
  /**
   * <pre>
   * Headers to include with the published message
   * </pre>
   *
   * <code>repeated .RecordHeader headers = 7;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * Headers to include with the published message
   * </pre>
   *
   * <code>repeated .RecordHeader headers = 7;</code>
   */
  java.util.List<? extends mailgun.kafkapixy.RecordHeaderOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <pre>
   * Headers to include with the published message
   * </pre>
   *
   * <code>repeated .RecordHeader headers = 7;</code>
   */
  mailgun.kafkapixy.RecordHeaderOrBuilder getHeadersOrBuilder(
      int index);
}
