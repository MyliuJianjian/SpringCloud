package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient //启动EnableEureka客户端
@SpringBootApplication
@EnableZuulProxy
public class MyZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyZuulApplication.class, args);
    }
}
