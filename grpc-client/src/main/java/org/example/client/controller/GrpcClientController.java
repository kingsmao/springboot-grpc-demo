package org.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @GetMapping("hello")
    public String hello(){
        return "hello grpc client!";
    }
}
