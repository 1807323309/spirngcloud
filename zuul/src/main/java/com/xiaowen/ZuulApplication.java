package com.xiaowen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy   //包含了EnableZuulServer,设置该类为网关启动类
@EnableAutoConfiguration  //将所有springboot的config配置到springboot的IOC容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
