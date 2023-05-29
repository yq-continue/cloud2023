package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yang
 * @create 2023-05-13 15:13
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(CloudGateway9527.class,args);
    }
}
