// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

public interface RecordHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RecordHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key in the header key-value pair
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Key in the header key-value pair
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Value in the header key-value pair
   * </pre>
   *
   * <code>bytes value = 2;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();
}
