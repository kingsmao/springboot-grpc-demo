package org.example.server.grpcService;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.server.entity.userInfo.UserInfoReq;
import org.example.server.entity.userInfo.UserInfoResponse;
import org.example.server.entity.userInfo.UserInfoServiceGrpc;
import org.example.server.entity.userInfo.UserStr;

@GrpcService //spring与grpc整合注解
public class UserInfoGrpcService extends UserInfoServiceGrpc.UserInfoServiceImplBase {

    @Override
    public void queryUserInfo(UserInfoReq request, StreamObserver<UserInfoResponse> responseObserver) {

    }

    @Override
    public void queryUserInfo2(UserInfoReq request, StreamObserver<UserInfoResponse> responseObserver) {
        super.queryUserInfo2(request, responseObserver);
    }

    @Override
    public void queryUserInfo3(UserStr request, StreamObserver<UserStr> responseObserver) {
        System.out.println("接收到参数str：" + request.getStr());
        responseObserver.onNext(UserStr.newBuilder().setStr("233333").build());
        responseObserver.onCompleted();
    }
}
