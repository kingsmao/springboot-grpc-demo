// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userInfo.proto

package org.example.server.entity.userInfo;

public interface UserInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>string msg = 2;</code>
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 2;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>bool success = 3;</code>
   */
  boolean getSuccess();

  /**
   * <code>.UserInfoResponse.Data data = 4;</code>
   */
  boolean hasData();
  /**
   * <code>.UserInfoResponse.Data data = 4;</code>
   */
  org.example.server.entity.userInfo.UserInfoResponse.Data getData();
  /**
   * <code>.UserInfoResponse.Data data = 4;</code>
   */
  org.example.server.entity.userInfo.UserInfoResponse.DataOrBuilder getDataOrBuilder();
}
