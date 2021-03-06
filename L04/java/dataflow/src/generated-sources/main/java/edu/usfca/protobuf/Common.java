// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package edu.usfca.protobuf;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StructuredDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:edu.usfca.protobuf.StructuredData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string device_id = 1;</code>
     */
    java.lang.String getDeviceId();
    /**
     * <code>optional string device_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();

    /**
     * <code>optional string app_id = 2;</code>
     */
    java.lang.String getAppId();
    /**
     * <code>optional string app_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getAppIdBytes();
  }
  /**
   * Protobuf type {@code edu.usfca.protobuf.StructuredData}
   */
  public  static final class StructuredData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:edu.usfca.protobuf.StructuredData)
      StructuredDataOrBuilder {
    // Use StructuredData.newBuilder() to construct.
    private StructuredData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StructuredData() {
      deviceId_ = "";
      appId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private StructuredData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              deviceId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              appId_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_StructuredData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_StructuredData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.usfca.protobuf.Common.StructuredData.class, edu.usfca.protobuf.Common.StructuredData.Builder.class);
    }

    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object deviceId_;
    /**
     * <code>optional string device_id = 1;</code>
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string device_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APP_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object appId_;
    /**
     * <code>optional string app_id = 2;</code>
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string app_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getDeviceIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceId_);
      }
      if (!getAppIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, appId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getDeviceIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceId_);
      }
      if (!getAppIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, appId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof edu.usfca.protobuf.Common.StructuredData)) {
        return super.equals(obj);
      }
      edu.usfca.protobuf.Common.StructuredData other = (edu.usfca.protobuf.Common.StructuredData) obj;

      boolean result = true;
      result = result && getDeviceId()
          .equals(other.getDeviceId());
      result = result && getAppId()
          .equals(other.getAppId());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceId().hashCode();
      hash = (37 * hash) + APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAppId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static edu.usfca.protobuf.Common.StructuredData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static edu.usfca.protobuf.Common.StructuredData parseFrom(
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
    public static Builder newBuilder(edu.usfca.protobuf.Common.StructuredData prototype) {
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
     * Protobuf type {@code edu.usfca.protobuf.StructuredData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:edu.usfca.protobuf.StructuredData)
        edu.usfca.protobuf.Common.StructuredDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_StructuredData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_StructuredData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                edu.usfca.protobuf.Common.StructuredData.class, edu.usfca.protobuf.Common.StructuredData.Builder.class);
      }

      // Construct using edu.usfca.protobuf.Common.StructuredData.newBuilder()
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
        deviceId_ = "";

        appId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return edu.usfca.protobuf.Common.internal_static_edu_usfca_protobuf_StructuredData_descriptor;
      }

      public edu.usfca.protobuf.Common.StructuredData getDefaultInstanceForType() {
        return edu.usfca.protobuf.Common.StructuredData.getDefaultInstance();
      }

      public edu.usfca.protobuf.Common.StructuredData build() {
        edu.usfca.protobuf.Common.StructuredData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public edu.usfca.protobuf.Common.StructuredData buildPartial() {
        edu.usfca.protobuf.Common.StructuredData result = new edu.usfca.protobuf.Common.StructuredData(this);
        result.deviceId_ = deviceId_;
        result.appId_ = appId_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof edu.usfca.protobuf.Common.StructuredData) {
          return mergeFrom((edu.usfca.protobuf.Common.StructuredData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(edu.usfca.protobuf.Common.StructuredData other) {
        if (other == edu.usfca.protobuf.Common.StructuredData.getDefaultInstance()) return this;
        if (!other.getDeviceId().isEmpty()) {
          deviceId_ = other.deviceId_;
          onChanged();
        }
        if (!other.getAppId().isEmpty()) {
          appId_ = other.appId_;
          onChanged();
        }
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
        edu.usfca.protobuf.Common.StructuredData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (edu.usfca.protobuf.Common.StructuredData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object deviceId_ = "";
      /**
       * <code>optional string device_id = 1;</code>
       */
      public java.lang.String getDeviceId() {
        java.lang.Object ref = deviceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          deviceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string device_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        java.lang.Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string device_id = 1;</code>
       */
      public Builder setDeviceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_id = 1;</code>
       */
      public Builder clearDeviceId() {
        
        deviceId_ = getDefaultInstance().getDeviceId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_id = 1;</code>
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object appId_ = "";
      /**
       * <code>optional string app_id = 2;</code>
       */
      public java.lang.String getAppId() {
        java.lang.Object ref = appId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          appId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string app_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAppIdBytes() {
        java.lang.Object ref = appId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string app_id = 2;</code>
       */
      public Builder setAppId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        appId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string app_id = 2;</code>
       */
      public Builder clearAppId() {
        
        appId_ = getDefaultInstance().getAppId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string app_id = 2;</code>
       */
      public Builder setAppIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        appId_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:edu.usfca.protobuf.StructuredData)
    }

    // @@protoc_insertion_point(class_scope:edu.usfca.protobuf.StructuredData)
    private static final edu.usfca.protobuf.Common.StructuredData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new edu.usfca.protobuf.Common.StructuredData();
    }

    public static edu.usfca.protobuf.Common.StructuredData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StructuredData>
        PARSER = new com.google.protobuf.AbstractParser<StructuredData>() {
      public StructuredData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new StructuredData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StructuredData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StructuredData> getParserForType() {
      return PARSER;
    }

    public edu.usfca.protobuf.Common.StructuredData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_edu_usfca_protobuf_StructuredData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_edu_usfca_protobuf_StructuredData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\022edu.usfca.protobuf\"3\n\016St" +
      "ructuredData\022\021\n\tdevice_id\030\001 \001(\t\022\016\n\006app_i" +
      "d\030\002 \001(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_edu_usfca_protobuf_StructuredData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_edu_usfca_protobuf_StructuredData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_edu_usfca_protobuf_StructuredData_descriptor,
        new java.lang.String[] { "DeviceId", "AppId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
