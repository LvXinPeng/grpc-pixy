// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

public interface GetOffsetsRsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetOffsetsRs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .PartitionOffset offsets = 1;</code>
   */
  java.util.List<mailgun.kafkapixy.PartitionOffset> 
      getOffsetsList();
  /**
   * <code>repeated .PartitionOffset offsets = 1;</code>
   */
  mailgun.kafkapixy.PartitionOffset getOffsets(int index);
  /**
   * <code>repeated .PartitionOffset offsets = 1;</code>
   */
  int getOffsetsCount();
  /**
   * <code>repeated .PartitionOffset offsets = 1;</code>
   */
  java.util.List<? extends mailgun.kafkapixy.PartitionOffsetOrBuilder> 
      getOffsetsOrBuilderList();
  /**
   * <code>repeated .PartitionOffset offsets = 1;</code>
   */
  mailgun.kafkapixy.PartitionOffsetOrBuilder getOffsetsOrBuilder(
      int index);
}
