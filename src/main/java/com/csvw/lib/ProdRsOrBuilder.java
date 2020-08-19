// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package com.csvw.lib;

public interface ProdRsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProdRs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Partition the message was written to. The value only makes sense if
   * ProdReq.async_mode was false.
   * </pre>
   *
   * <code>int32 partition = 1;</code>
   * @return The partition.
   */
  int getPartition();

  /**
   * <pre>
   * Offset the message was written to. The value only makes sense if
   * ProdReq.async_mode was false.
   * </pre>
   *
   * <code>int64 offset = 2;</code>
   * @return The offset.
   */
  long getOffset();
}
