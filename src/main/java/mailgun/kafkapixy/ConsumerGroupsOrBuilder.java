// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

public interface ConsumerGroupsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConsumerGroups)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .ConsumerPartitions&gt; consumers = 1;</code>
   */
  int getConsumersCount();
  /**
   * <code>map&lt;string, .ConsumerPartitions&gt; consumers = 1;</code>
   */
  boolean containsConsumers(
      java.lang.String key);
  /**
   * Use {@link #getConsumersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, mailgun.kafkapixy.ConsumerPartitions>
  getConsumers();
  /**
   * <code>map&lt;string, .ConsumerPartitions&gt; consumers = 1;</code>
   */
  java.util.Map<java.lang.String, mailgun.kafkapixy.ConsumerPartitions>
  getConsumersMap();
  /**
   * <code>map&lt;string, .ConsumerPartitions&gt; consumers = 1;</code>
   */

  mailgun.kafkapixy.ConsumerPartitions getConsumersOrDefault(
      java.lang.String key,
      mailgun.kafkapixy.ConsumerPartitions defaultValue);
  /**
   * <code>map&lt;string, .ConsumerPartitions&gt; consumers = 1;</code>
   */

  mailgun.kafkapixy.ConsumerPartitions getConsumersOrThrow(
      java.lang.String key);
}