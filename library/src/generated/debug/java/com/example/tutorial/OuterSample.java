// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MainItem.proto

package com.example.tutorial;

public final class OuterSample {
  private OuterSample() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Msg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Msg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SecondMsg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SecondMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016MainItem.proto\",\n\003Msg\022\013\n\003foo\030\001 \001(\t\022\030\n\004" +
      "blah\030\002 \001(\0132\n.SecondMsg\"\031\n\tSecondMsg\022\014\n\004b" +
      "lah\030\001 \001(\005B%\n\024com.example.tutorialB\013Outer" +
      "SampleP\001b\006proto3"
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
    internal_static_Msg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Msg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Msg_descriptor,
        new java.lang.String[] { "Foo", "Blah", });
    internal_static_SecondMsg_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SecondMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SecondMsg_descriptor,
        new java.lang.String[] { "Blah", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}