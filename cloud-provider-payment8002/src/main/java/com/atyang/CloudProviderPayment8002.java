package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yang
 * @create 2023-05-07 12:50
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002.class,args);
    }
}
