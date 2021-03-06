// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafkapixy.proto

package mailgun.kafkapixy;

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

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsumerPartitions();
  }

  @java.lang.Override
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
      throw new java.lang.NullPointerException();
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
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_ConsumerPartitions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return mailgun.kafkapixy.KafkaPixyProto.internal_static_ConsumerPartitions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            mailgun.kafkapixy.ConsumerPartitions.class, mailgun.kafkapixy.ConsumerPartitions.Builder.class);
  }

  public static final int PARTITIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList partitions_;
  /**
   * <code>repeated int32 partitions = 1;</code>
   * @return A list containing the partitions.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
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
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
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

  @java.lang.Override
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

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof mailgun.kafkapixy.ConsumerPartitions)) {
      return super.equals(obj);
    }
    mailgun.kafkapixy.ConsumerPartitions other = (mailgun.kafkapixy.ConsumerPartitions) obj;

    if (!getPartitionsList()
        .equals(other.getPartitionsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
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

  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static mailgun.kafkapixy.ConsumerPartitions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(mailgun.kafkapixy.ConsumerPartitions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ConsumerPartitions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ConsumerPartitions)
      mailgun.kafkapixy.ConsumerPartitionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_ConsumerPartitions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_ConsumerPartitions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              mailgun.kafkapixy.ConsumerPartitions.class, mailgun.kafkapixy.ConsumerPartitions.Builder.class);
    }

    // Construct using mailgun.kafkapixy.ConsumerPartitions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      partitions_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return mailgun.kafkapixy.KafkaPixyProto.internal_static_ConsumerPartitions_descriptor;
    }

    @java.lang.Override
    public mailgun.kafkapixy.ConsumerPartitions getDefaultInstanceForType() {
      return mailgun.kafkapixy.ConsumerPartitions.getDefaultInstance();
    }

    @java.lang.Override
    public mailgun.kafkapixy.ConsumerPartitions build() {
      mailgun.kafkapixy.ConsumerPartitions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public mailgun.kafkapixy.ConsumerPartitions buildPartial() {
      mailgun.kafkapixy.ConsumerPartitions result = new mailgun.kafkapixy.ConsumerPartitions(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        partitions_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.partitions_ = partitions_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof mailgun.kafkapixy.ConsumerPartitions) {
        return mergeFrom((mailgun.kafkapixy.ConsumerPartitions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(mailgun.kafkapixy.ConsumerPartitions other) {
      if (other == mailgun.kafkapixy.ConsumerPartitions.getDefaultInstance()) return this;
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

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      mailgun.kafkapixy.ConsumerPartitions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (mailgun.kafkapixy.ConsumerPartitions) e.getUnfinishedMessage();
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
    public java.util.List<java.lang.Integer>
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
        java.lang.Iterable<? extends java.lang.Integer> values) {
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
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ConsumerPartitions)
  }

  // @@protoc_insertion_point(class_scope:ConsumerPartitions)
  private static final mailgun.kafkapixy.ConsumerPartitions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new mailgun.kafkapixy.ConsumerPartitions();
  }

  public static mailgun.kafkapixy.ConsumerPartitions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumerPartitions>
      PARSER = new com.google.protobuf.AbstractParser<ConsumerPartitions>() {
    @java.lang.Override
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

  @java.lang.Override
  public com.google.protobuf.Parser<ConsumerPartitions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public mailgun.kafkapixy.ConsumerPartitions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

