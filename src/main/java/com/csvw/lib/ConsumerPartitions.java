// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package com.csvw.lib;

/**
 * Protobuf type {@code ConsumerPartitions}
 */
public final class ConsumerPartitions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ConsumerPartitions)
    ConsumerPartitionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsumerPartitions.newBuilder() to construct.
  private ConsumerPartitions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsumerPartitions() {
    partitions_ = emptyIntList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsumerPartitions();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsumerPartitions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              partitions_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            partitions_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              partitions_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              partitions_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        partitions_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Kafkapixy.internal_static_ConsumerPartitions_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Kafkapixy.internal_static_ConsumerPartitions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ConsumerPartitions.class, ConsumerPartitions.Builder.class);
  }

  public static final int PARTITIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList partitions_;
  /**
   * <code>repeated int32 partitions = 1;</code>
   * @return A list containing the partitions.
   */
  @Override
  public java.util.List<Integer>
      getPartitionsList() {
    return partitions_;
  }
  /**
   * <code>repeated int32 partitions = 1;</code>
   * @return The count of partitions.
   */
  public int getPartitionsCount() {
    return partitions_.size();
  }
  /**
   * <code>repeated int32 partitions = 1;</code>
   * @param index The index of the element to return.
   * @return The partitions at the given index.
   */
  public int getPartitions(int index) {
    return partitions_.getInt(index);
  }
  private int partitionsMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getPartitionsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(partitionsMemoizedSerializedSize);
    }
    for (int i = 0; i < partitions_.size(); i++) {
      output.writeInt32NoTag(partitions_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < partitions_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(partitions_.getInt(i));
      }
      size += dataSize;
      if (!getPartitionsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      partitionsMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ConsumerPartitions)) {
      return super.equals(obj);
    }
    ConsumerPartitions other = (ConsumerPartitions) obj;

    if (!getPartitionsList()
        .equals(other.getPartitionsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPartitionsCount() > 0) {
      hash = (37 * hash) + PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ConsumerPartitions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsumerPartitions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsumerPartitions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsumerPartitions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsumerPartitions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConsumerPartitions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConsumerPartitions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConsumerPartitions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConsumerPartitions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ConsumerPartitions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConsumerPartitions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConsumerPartitions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ConsumerPartitions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ConsumerPartitions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsumerPartitions)
      ConsumerPartitionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Kafkapixy.internal_static_ConsumerPartitions_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Kafkapixy.internal_static_ConsumerPartitions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConsumerPartitions.class, ConsumerPartitions.Builder.class);
    }

    // Construct using com.csvw.lib.ConsumerPartitions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      partitions_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Kafkapixy.internal_static_ConsumerPartitions_descriptor;
    }

    @Override
    public ConsumerPartitions getDefaultInstanceForType() {
      return ConsumerPartitions.getDefaultInstance();
    }

    @Override
    public ConsumerPartitions build() {
      ConsumerPartitions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ConsumerPartitions buildPartial() {
      ConsumerPartitions result = new ConsumerPartitions(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        partitions_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.partitions_ = partitions_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ConsumerPartitions) {
        return mergeFrom((ConsumerPartitions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ConsumerPartitions other) {
      if (other == ConsumerPartitions.getDefaultInstance()) return this;
      if (!other.partitions_.isEmpty()) {
        if (partitions_.isEmpty()) {
          partitions_ = other.partitions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePartitionsIsMutable();
          partitions_.addAll(other.partitions_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ConsumerPartitions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ConsumerPartitions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList partitions_ = emptyIntList();
    private void ensurePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partitions_ = mutableCopy(partitions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @return A list containing the partitions.
     */
    public java.util.List<Integer>
        getPartitionsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(partitions_) : partitions_;
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @return The count of partitions.
     */
    public int getPartitionsCount() {
      return partitions_.size();
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @param index The index of the element to return.
     * @return The partitions at the given index.
     */
    public int getPartitions(int index) {
      return partitions_.getInt(index);
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @param index The index to set the value at.
     * @param value The partitions to set.
     * @return This builder for chaining.
     */
    public Builder setPartitions(
        int index, int value) {
      ensurePartitionsIsMutable();
      partitions_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @param value The partitions to add.
     * @return This builder for chaining.
     */
    public Builder addPartitions(int value) {
      ensurePartitionsIsMutable();
      partitions_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @param values The partitions to add.
     * @return This builder for chaining.
     */
    public Builder addAllPartitions(
        Iterable<? extends Integer> values) {
      ensurePartitionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partitions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partitions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartitions() {
      partitions_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ConsumerPartitions)
  }

  // @@protoc_insertion_point(class_scope:ConsumerPartitions)
  private static final ConsumerPartitions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ConsumerPartitions();
  }

  public static ConsumerPartitions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumerPartitions>
      PARSER = new com.google.protobuf.AbstractParser<ConsumerPartitions>() {
    @Override
    public ConsumerPartitions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsumerPartitions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsumerPartitions> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ConsumerPartitions> getParserForType() {
    return PARSER;
  }

  @Override
  public ConsumerPartitions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

