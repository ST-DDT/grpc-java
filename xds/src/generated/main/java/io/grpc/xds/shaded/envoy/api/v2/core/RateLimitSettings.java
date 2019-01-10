// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/config_source.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Rate Limit settings to be applied for discovery requests made by Envoy.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.RateLimitSettings}
 */
public  final class RateLimitSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.RateLimitSettings)
    RateLimitSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLimitSettings.newBuilder() to construct.
  private RateLimitSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLimitSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RateLimitSettings(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (maxTokens_ != null) {
              subBuilder = maxTokens_.toBuilder();
            }
            maxTokens_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxTokens_);
              maxTokens_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.DoubleValue.Builder subBuilder = null;
            if (fillRate_ != null) {
              subBuilder = fillRate_.toBuilder();
            }
            fillRate_ = input.readMessage(com.google.protobuf.DoubleValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fillRate_);
              fillRate_ = subBuilder.buildPartial();
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
    return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_RateLimitSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_RateLimitSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.class, io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.Builder.class);
  }

  public static final int MAX_TOKENS_FIELD_NUMBER = 1;
  private com.google.protobuf.UInt32Value maxTokens_;
  /**
   * <pre>
   * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
   * default value of 100 will be used.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
   */
  public boolean hasMaxTokens() {
    return maxTokens_ != null;
  }
  /**
   * <pre>
   * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
   * default value of 100 will be used.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
   */
  public com.google.protobuf.UInt32Value getMaxTokens() {
    return maxTokens_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
  }
  /**
   * <pre>
   * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
   * default value of 100 will be used.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
   */
  public com.google.protobuf.UInt32ValueOrBuilder getMaxTokensOrBuilder() {
    return getMaxTokens();
  }

  public static final int FILL_RATE_FIELD_NUMBER = 2;
  private com.google.protobuf.DoubleValue fillRate_;
  /**
   * <pre>
   * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
   * per second will be used.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
   */
  public boolean hasFillRate() {
    return fillRate_ != null;
  }
  /**
   * <pre>
   * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
   * per second will be used.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.DoubleValue getFillRate() {
    return fillRate_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
  }
  /**
   * <pre>
   * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
   * per second will be used.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.DoubleValueOrBuilder getFillRateOrBuilder() {
    return getFillRate();
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
    if (maxTokens_ != null) {
      output.writeMessage(1, getMaxTokens());
    }
    if (fillRate_ != null) {
      output.writeMessage(2, getFillRate());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxTokens_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMaxTokens());
    }
    if (fillRate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFillRate());
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
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings other = (io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings) obj;

    boolean result = true;
    result = result && (hasMaxTokens() == other.hasMaxTokens());
    if (hasMaxTokens()) {
      result = result && getMaxTokens()
          .equals(other.getMaxTokens());
    }
    result = result && (hasFillRate() == other.hasFillRate());
    if (hasFillRate()) {
      result = result && getFillRate()
          .equals(other.getFillRate());
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
    if (hasMaxTokens()) {
      hash = (37 * hash) + MAX_TOKENS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxTokens().hashCode();
    }
    if (hasFillRate()) {
      hash = (37 * hash) + FILL_RATE_FIELD_NUMBER;
      hash = (53 * hash) + getFillRate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parseFrom(
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
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings prototype) {
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
   * Rate Limit settings to be applied for discovery requests made by Envoy.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.RateLimitSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.RateLimitSettings)
      io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_RateLimitSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_RateLimitSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.class, io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.newBuilder()
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
      if (maxTokensBuilder_ == null) {
        maxTokens_ = null;
      } else {
        maxTokens_ = null;
        maxTokensBuilder_ = null;
      }
      if (fillRateBuilder_ == null) {
        fillRate_ = null;
      } else {
        fillRate_ = null;
        fillRateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.internal_static_envoy_api_v2_core_RateLimitSettings_descriptor;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.getDefaultInstance();
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings build() {
      io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings result = new io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings(this);
      if (maxTokensBuilder_ == null) {
        result.maxTokens_ = maxTokens_;
      } else {
        result.maxTokens_ = maxTokensBuilder_.build();
      }
      if (fillRateBuilder_ == null) {
        result.fillRate_ = fillRate_;
      } else {
        result.fillRate_ = fillRateBuilder_.build();
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
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings.getDefaultInstance()) return this;
      if (other.hasMaxTokens()) {
        mergeMaxTokens(other.getMaxTokens());
      }
      if (other.hasFillRate()) {
        mergeFillRate(other.getFillRate());
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
      io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.UInt32Value maxTokens_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> maxTokensBuilder_;
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public boolean hasMaxTokens() {
      return maxTokensBuilder_ != null || maxTokens_ != null;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public com.google.protobuf.UInt32Value getMaxTokens() {
      if (maxTokensBuilder_ == null) {
        return maxTokens_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
      } else {
        return maxTokensBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder setMaxTokens(com.google.protobuf.UInt32Value value) {
      if (maxTokensBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxTokens_ = value;
        onChanged();
      } else {
        maxTokensBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder setMaxTokens(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (maxTokensBuilder_ == null) {
        maxTokens_ = builderForValue.build();
        onChanged();
      } else {
        maxTokensBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder mergeMaxTokens(com.google.protobuf.UInt32Value value) {
      if (maxTokensBuilder_ == null) {
        if (maxTokens_ != null) {
          maxTokens_ =
            com.google.protobuf.UInt32Value.newBuilder(maxTokens_).mergeFrom(value).buildPartial();
        } else {
          maxTokens_ = value;
        }
        onChanged();
      } else {
        maxTokensBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public Builder clearMaxTokens() {
      if (maxTokensBuilder_ == null) {
        maxTokens_ = null;
        onChanged();
      } else {
        maxTokens_ = null;
        maxTokensBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getMaxTokensBuilder() {
      
      onChanged();
      return getMaxTokensFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getMaxTokensOrBuilder() {
      if (maxTokensBuilder_ != null) {
        return maxTokensBuilder_.getMessageOrBuilder();
      } else {
        return maxTokens_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : maxTokens_;
      }
    }
    /**
     * <pre>
     * Maximum number of tokens to be used for rate limting discovery request calls. If not set, a
     * default value of 100 will be used.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_tokens = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getMaxTokensFieldBuilder() {
      if (maxTokensBuilder_ == null) {
        maxTokensBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getMaxTokens(),
                getParentForChildren(),
                isClean());
        maxTokens_ = null;
      }
      return maxTokensBuilder_;
    }

    private com.google.protobuf.DoubleValue fillRate_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> fillRateBuilder_;
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public boolean hasFillRate() {
      return fillRateBuilder_ != null || fillRate_ != null;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.DoubleValue getFillRate() {
      if (fillRateBuilder_ == null) {
        return fillRate_ == null ? com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
      } else {
        return fillRateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setFillRate(com.google.protobuf.DoubleValue value) {
      if (fillRateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fillRate_ = value;
        onChanged();
      } else {
        fillRateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setFillRate(
        com.google.protobuf.DoubleValue.Builder builderForValue) {
      if (fillRateBuilder_ == null) {
        fillRate_ = builderForValue.build();
        onChanged();
      } else {
        fillRateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeFillRate(com.google.protobuf.DoubleValue value) {
      if (fillRateBuilder_ == null) {
        if (fillRate_ != null) {
          fillRate_ =
            com.google.protobuf.DoubleValue.newBuilder(fillRate_).mergeFrom(value).buildPartial();
        } else {
          fillRate_ = value;
        }
        onChanged();
      } else {
        fillRateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearFillRate() {
      if (fillRateBuilder_ == null) {
        fillRate_ = null;
        onChanged();
      } else {
        fillRate_ = null;
        fillRateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.DoubleValue.Builder getFillRateBuilder() {
      
      onChanged();
      return getFillRateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.DoubleValueOrBuilder getFillRateOrBuilder() {
      if (fillRateBuilder_ != null) {
        return fillRateBuilder_.getMessageOrBuilder();
      } else {
        return fillRate_ == null ?
            com.google.protobuf.DoubleValue.getDefaultInstance() : fillRate_;
      }
    }
    /**
     * <pre>
     * Rate at which tokens will be filled per second. If not set, a default fill rate of 10 tokens
     * per second will be used.
     * </pre>
     *
     * <code>.google.protobuf.DoubleValue fill_rate = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder> 
        getFillRateFieldBuilder() {
      if (fillRateBuilder_ == null) {
        fillRateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.DoubleValue, com.google.protobuf.DoubleValue.Builder, com.google.protobuf.DoubleValueOrBuilder>(
                getFillRate(),
                getParentForChildren(),
                isClean());
        fillRate_ = null;
      }
      return fillRateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.RateLimitSettings)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.RateLimitSettings)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimitSettings>
      PARSER = new com.google.protobuf.AbstractParser<RateLimitSettings>() {
    public RateLimitSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RateLimitSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RateLimitSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimitSettings> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.envoy.api.v2.core.RateLimitSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
