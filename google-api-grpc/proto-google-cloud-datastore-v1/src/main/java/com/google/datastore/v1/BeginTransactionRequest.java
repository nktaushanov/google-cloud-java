// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

/**
 * <pre>
 * The request for [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.BeginTransactionRequest}
 */
public  final class BeginTransactionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.BeginTransactionRequest)
    BeginTransactionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BeginTransactionRequest.newBuilder() to construct.
  private BeginTransactionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BeginTransactionRequest() {
    projectId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BeginTransactionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 82: {
            com.google.datastore.v1.TransactionOptions.Builder subBuilder = null;
            if (transactionOptions_ != null) {
              subBuilder = transactionOptions_.toBuilder();
            }
            transactionOptions_ = input.readMessage(com.google.datastore.v1.TransactionOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transactionOptions_);
              transactionOptions_ = subBuilder.buildPartial();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.BeginTransactionRequest.class, com.google.datastore.v1.BeginTransactionRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8;</code>
   */
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSACTION_OPTIONS_FIELD_NUMBER = 10;
  private com.google.datastore.v1.TransactionOptions transactionOptions_;
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   */
  public boolean hasTransactionOptions() {
    return transactionOptions_ != null;
  }
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   */
  public com.google.datastore.v1.TransactionOptions getTransactionOptions() {
    return transactionOptions_ == null ? com.google.datastore.v1.TransactionOptions.getDefaultInstance() : transactionOptions_;
  }
  /**
   * <pre>
   * Options for a new transaction.
   * </pre>
   *
   * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
   */
  public com.google.datastore.v1.TransactionOptionsOrBuilder getTransactionOptionsOrBuilder() {
    return getTransactionOptions();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, projectId_);
    }
    if (transactionOptions_ != null) {
      output.writeMessage(10, getTransactionOptions());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, projectId_);
    }
    if (transactionOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getTransactionOptions());
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
    if (!(obj instanceof com.google.datastore.v1.BeginTransactionRequest)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.BeginTransactionRequest other = (com.google.datastore.v1.BeginTransactionRequest) obj;

    boolean result = true;
    result = result && getProjectId()
        .equals(other.getProjectId());
    result = result && (hasTransactionOptions() == other.hasTransactionOptions());
    if (hasTransactionOptions()) {
      result = result && getTransactionOptions()
          .equals(other.getTransactionOptions());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (hasTransactionOptions()) {
      hash = (37 * hash) + TRANSACTION_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getTransactionOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.BeginTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.datastore.v1.BeginTransactionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * The request for [Datastore.BeginTransaction][google.datastore.v1.Datastore.BeginTransaction].
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.BeginTransactionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.BeginTransactionRequest)
      com.google.datastore.v1.BeginTransactionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_BeginTransactionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.BeginTransactionRequest.class, com.google.datastore.v1.BeginTransactionRequest.Builder.class);
    }

    // Construct using com.google.datastore.v1.BeginTransactionRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      projectId_ = "";

      if (transactionOptionsBuilder_ == null) {
        transactionOptions_ = null;
      } else {
        transactionOptions_ = null;
        transactionOptionsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto.internal_static_google_datastore_v1_BeginTransactionRequest_descriptor;
    }

    public com.google.datastore.v1.BeginTransactionRequest getDefaultInstanceForType() {
      return com.google.datastore.v1.BeginTransactionRequest.getDefaultInstance();
    }

    public com.google.datastore.v1.BeginTransactionRequest build() {
      com.google.datastore.v1.BeginTransactionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.datastore.v1.BeginTransactionRequest buildPartial() {
      com.google.datastore.v1.BeginTransactionRequest result = new com.google.datastore.v1.BeginTransactionRequest(this);
      result.projectId_ = projectId_;
      if (transactionOptionsBuilder_ == null) {
        result.transactionOptions_ = transactionOptions_;
      } else {
        result.transactionOptions_ = transactionOptionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.BeginTransactionRequest) {
        return mergeFrom((com.google.datastore.v1.BeginTransactionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.BeginTransactionRequest other) {
      if (other == com.google.datastore.v1.BeginTransactionRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.hasTransactionOptions()) {
        mergeTransactionOptions(other.getTransactionOptions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.datastore.v1.BeginTransactionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.BeginTransactionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the project against which to make the request.
     * </pre>
     *
     * <code>string project_id = 8;</code>
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private com.google.datastore.v1.TransactionOptions transactionOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.TransactionOptions, com.google.datastore.v1.TransactionOptions.Builder, com.google.datastore.v1.TransactionOptionsOrBuilder> transactionOptionsBuilder_;
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public boolean hasTransactionOptions() {
      return transactionOptionsBuilder_ != null || transactionOptions_ != null;
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public com.google.datastore.v1.TransactionOptions getTransactionOptions() {
      if (transactionOptionsBuilder_ == null) {
        return transactionOptions_ == null ? com.google.datastore.v1.TransactionOptions.getDefaultInstance() : transactionOptions_;
      } else {
        return transactionOptionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder setTransactionOptions(com.google.datastore.v1.TransactionOptions value) {
      if (transactionOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transactionOptions_ = value;
        onChanged();
      } else {
        transactionOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder setTransactionOptions(
        com.google.datastore.v1.TransactionOptions.Builder builderForValue) {
      if (transactionOptionsBuilder_ == null) {
        transactionOptions_ = builderForValue.build();
        onChanged();
      } else {
        transactionOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder mergeTransactionOptions(com.google.datastore.v1.TransactionOptions value) {
      if (transactionOptionsBuilder_ == null) {
        if (transactionOptions_ != null) {
          transactionOptions_ =
            com.google.datastore.v1.TransactionOptions.newBuilder(transactionOptions_).mergeFrom(value).buildPartial();
        } else {
          transactionOptions_ = value;
        }
        onChanged();
      } else {
        transactionOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public Builder clearTransactionOptions() {
      if (transactionOptionsBuilder_ == null) {
        transactionOptions_ = null;
        onChanged();
      } else {
        transactionOptions_ = null;
        transactionOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public com.google.datastore.v1.TransactionOptions.Builder getTransactionOptionsBuilder() {
      
      onChanged();
      return getTransactionOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    public com.google.datastore.v1.TransactionOptionsOrBuilder getTransactionOptionsOrBuilder() {
      if (transactionOptionsBuilder_ != null) {
        return transactionOptionsBuilder_.getMessageOrBuilder();
      } else {
        return transactionOptions_ == null ?
            com.google.datastore.v1.TransactionOptions.getDefaultInstance() : transactionOptions_;
      }
    }
    /**
     * <pre>
     * Options for a new transaction.
     * </pre>
     *
     * <code>.google.datastore.v1.TransactionOptions transaction_options = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.TransactionOptions, com.google.datastore.v1.TransactionOptions.Builder, com.google.datastore.v1.TransactionOptionsOrBuilder> 
        getTransactionOptionsFieldBuilder() {
      if (transactionOptionsBuilder_ == null) {
        transactionOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.TransactionOptions, com.google.datastore.v1.TransactionOptions.Builder, com.google.datastore.v1.TransactionOptionsOrBuilder>(
                getTransactionOptions(),
                getParentForChildren(),
                isClean());
        transactionOptions_ = null;
      }
      return transactionOptionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.BeginTransactionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.BeginTransactionRequest)
  private static final com.google.datastore.v1.BeginTransactionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.BeginTransactionRequest();
  }

  public static com.google.datastore.v1.BeginTransactionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BeginTransactionRequest>
      PARSER = new com.google.protobuf.AbstractParser<BeginTransactionRequest>() {
    public BeginTransactionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BeginTransactionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BeginTransactionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BeginTransactionRequest> getParserForType() {
    return PARSER;
  }

  public com.google.datastore.v1.BeginTransactionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
