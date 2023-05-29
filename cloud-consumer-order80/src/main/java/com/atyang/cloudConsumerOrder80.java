package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yang
 * @create 2023-05-06 20:02
 */
@SpringBootApplication
@EnableEurekaClient
public class cloudConsumerOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(cloudConsumerOrder80.class,args);
    }
}
