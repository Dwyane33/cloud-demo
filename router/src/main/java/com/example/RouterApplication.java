package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy        //表明该服务利用zuul实现路由功能
public class RouterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RouterApplication.class,args);
    }
}
