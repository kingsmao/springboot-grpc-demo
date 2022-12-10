package org.example.server.entity.userInfo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: userInfo.proto")
public final class UserInfoServiceGrpc {

  private UserInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "UserInfoService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryUserInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> METHOD_QUERY_USER_INFO = getQueryUserInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfoMethod() {
    return getQueryUserInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfoMethodHelper() {
    io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq, org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfoMethod;
    if ((getQueryUserInfoMethod = UserInfoServiceGrpc.getQueryUserInfoMethod) == null) {
      synchronized (UserInfoServiceGrpc.class) {
        if ((getQueryUserInfoMethod = UserInfoServiceGrpc.getQueryUserInfoMethod) == null) {
          UserInfoServiceGrpc.getQueryUserInfoMethod = getQueryUserInfoMethod = 
              io.grpc.MethodDescriptor.<org.example.server.entity.userInfo.UserInfoReq, org.example.server.entity.userInfo.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserInfoService", "queryUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.server.entity.userInfo.UserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.server.entity.userInfo.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserInfoServiceMethodDescriptorSupplier("queryUserInfo"))
                  .build();
          }
        }
     }
     return getQueryUserInfoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryUserInfo2Method()} instead. 
  public static final io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> METHOD_QUERY_USER_INFO2 = getQueryUserInfo2MethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfo2Method;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfo2Method() {
    return getQueryUserInfo2MethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq,
      org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfo2MethodHelper() {
    io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserInfoReq, org.example.server.entity.userInfo.UserInfoResponse> getQueryUserInfo2Method;
    if ((getQueryUserInfo2Method = UserInfoServiceGrpc.getQueryUserInfo2Method) == null) {
      synchronized (UserInfoServiceGrpc.class) {
        if ((getQueryUserInfo2Method = UserInfoServiceGrpc.getQueryUserInfo2Method) == null) {
          UserInfoServiceGrpc.getQueryUserInfo2Method = getQueryUserInfo2Method = 
              io.grpc.MethodDescriptor.<org.example.server.entity.userInfo.UserInfoReq, org.example.server.entity.userInfo.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserInfoService", "queryUserInfo2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.server.entity.userInfo.UserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.server.entity.userInfo.UserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserInfoServiceMethodDescriptorSupplier("queryUserInfo2"))
                  .build();
          }
        }
     }
     return getQueryUserInfo2Method;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryUserInfo3Method()} instead. 
  public static final io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserStr,
      org.example.server.entity.userInfo.UserStr> METHOD_QUERY_USER_INFO3 = getQueryUserInfo3MethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserStr,
      org.example.server.entity.userInfo.UserStr> getQueryUserInfo3Method;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserStr,
      org.example.server.entity.userInfo.UserStr> getQueryUserInfo3Method() {
    return getQueryUserInfo3MethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserStr,
      org.example.server.entity.userInfo.UserStr> getQueryUserInfo3MethodHelper() {
    io.grpc.MethodDescriptor<org.example.server.entity.userInfo.UserStr, org.example.server.entity.userInfo.UserStr> getQueryUserInfo3Method;
    if ((getQueryUserInfo3Method = UserInfoServiceGrpc.getQueryUserInfo3Method) == null) {
      synchronized (UserInfoServiceGrpc.class) {
        if ((getQueryUserInfo3Method = UserInfoServiceGrpc.getQueryUserInfo3Method) == null) {
          UserInfoServiceGrpc.getQueryUserInfo3Method = getQueryUserInfo3Method = 
              io.grpc.MethodDescriptor.<org.example.server.entity.userInfo.UserStr, org.example.server.entity.userInfo.UserStr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserInfoService", "queryUserInfo3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.server.entity.userInfo.UserStr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.server.entity.userInfo.UserStr.getDefaultInstance()))
                  .setSchemaDescriptor(new UserInfoServiceMethodDescriptorSupplier("queryUserInfo3"))
                  .build();
          }
        }
     }
     return getQueryUserInfo3Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserInfoServiceStub newStub(io.grpc.Channel channel) {
    return new UserInfoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserInfoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserInfoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserInfoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryUserInfo(org.example.server.entity.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryUserInfoMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryUserInfo2(org.example.server.entity.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryUserInfo2MethodHelper(), responseObserver);
    }

    /**
     */
    public void queryUserInfo3(org.example.server.entity.userInfo.UserStr request,
        io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserStr> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryUserInfo3MethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryUserInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.server.entity.userInfo.UserInfoReq,
                org.example.server.entity.userInfo.UserInfoResponse>(
                  this, METHODID_QUERY_USER_INFO)))
          .addMethod(
            getQueryUserInfo2MethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.server.entity.userInfo.UserInfoReq,
                org.example.server.entity.userInfo.UserInfoResponse>(
                  this, METHODID_QUERY_USER_INFO2)))
          .addMethod(
            getQueryUserInfo3MethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.server.entity.userInfo.UserStr,
                org.example.server.entity.userInfo.UserStr>(
                  this, METHODID_QUERY_USER_INFO3)))
          .build();
    }
  }

  /**
   */
  public static final class UserInfoServiceStub extends io.grpc.stub.AbstractStub<UserInfoServiceStub> {
    private UserInfoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInfoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInfoServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryUserInfo(org.example.server.entity.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryUserInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserInfo2(org.example.server.entity.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryUserInfo2MethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserInfo3(org.example.server.entity.userInfo.UserStr request,
        io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserStr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryUserInfo3MethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserInfoServiceBlockingStub extends io.grpc.stub.AbstractStub<UserInfoServiceBlockingStub> {
    private UserInfoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInfoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.server.entity.userInfo.UserInfoResponse queryUserInfo(org.example.server.entity.userInfo.UserInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getQueryUserInfoMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.example.server.entity.userInfo.UserInfoResponse queryUserInfo2(org.example.server.entity.userInfo.UserInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getQueryUserInfo2MethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.example.server.entity.userInfo.UserStr queryUserInfo3(org.example.server.entity.userInfo.UserStr request) {
      return blockingUnaryCall(
          getChannel(), getQueryUserInfo3MethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserInfoServiceFutureStub extends io.grpc.stub.AbstractStub<UserInfoServiceFutureStub> {
    private UserInfoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserInfoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserInfoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.server.entity.userInfo.UserInfoResponse> queryUserInfo(
        org.example.server.entity.userInfo.UserInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryUserInfoMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.server.entity.userInfo.UserInfoResponse> queryUserInfo2(
        org.example.server.entity.userInfo.UserInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryUserInfo2MethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.server.entity.userInfo.UserStr> queryUserInfo3(
        org.example.server.entity.userInfo.UserStr request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryUserInfo3MethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_USER_INFO = 0;
  private static final int METHODID_QUERY_USER_INFO2 = 1;
  private static final int METHODID_QUERY_USER_INFO3 = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserInfoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserInfoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_USER_INFO:
          serviceImpl.queryUserInfo((org.example.server.entity.userInfo.UserInfoReq) request,
              (io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_INFO2:
          serviceImpl.queryUserInfo2((org.example.server.entity.userInfo.UserInfoReq) request,
              (io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_INFO3:
          serviceImpl.queryUserInfo3((org.example.server.entity.userInfo.UserStr) request,
              (io.grpc.stub.StreamObserver<org.example.server.entity.userInfo.UserStr>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.server.entity.userInfo.UserInfoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserInfoService");
    }
  }

  private static final class UserInfoServiceFileDescriptorSupplier
      extends UserInfoServiceBaseDescriptorSupplier {
    UserInfoServiceFileDescriptorSupplier() {}
  }

  private static final class UserInfoServiceMethodDescriptorSupplier
      extends UserInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserInfoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserInfoServiceFileDescriptorSupplier())
              .addMethod(getQueryUserInfoMethodHelper())
              .addMethod(getQueryUserInfo2MethodHelper())
              .addMethod(getQueryUserInfo3MethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
