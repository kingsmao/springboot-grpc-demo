package org.example.client.controller;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.server.entity.userInfo.UserInfoServiceGrpc;
import org.example.server.entity.userInfo.UserStr;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class GrpcClientController {

    @GrpcClient("grpc-server")
    UserInfoServiceGrpc.UserInfoServiceFutureStub userInfoServiceFutureStub;

    @GetMapping("hello")
    public String hello(){
        return "hello grpc client!";
    }

    @GetMapping("touch")
    public String touch() throws ExecutionException, InterruptedException {
       return userInfoServiceFutureStub.queryUserInfo3(UserStr.newBuilder().setStr("泥好 grpc server").build()).get().getStr();
    }

    /**
     * demo来源：
     *  https://zhuanlan.zhihu.com/p/434323358
     *  https://blog.csdn.net/llyilo/article/details/122554816
     */
}
