package com.xiaowen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
@EnableDiscoveryClient
public class NativeConfigClientController {

    @Value("${server.port}")
    String port;

    @Value("${foo}")
    String foo;


    @GetMapping("/index")
    public String index(){
        return port+"----"+foo;
    }

}
