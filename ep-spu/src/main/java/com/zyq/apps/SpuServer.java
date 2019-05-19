package com.zyq.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpuServer {

    public static void main(String[] args) {
        SpringApplication.run(SpuServer.class,args);
    }
}
