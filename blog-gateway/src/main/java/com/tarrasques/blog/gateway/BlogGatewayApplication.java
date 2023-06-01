package com.tarrasques.blog.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.tarrasques.blog.gateway.mapper")
@EnableDiscoveryClient
public class BlogGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogGatewayApplication.class, args);
    }

}