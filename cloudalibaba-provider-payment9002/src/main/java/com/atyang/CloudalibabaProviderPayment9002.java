package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yang
 * @create 2023-05-15 21:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaProviderPayment9002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9002.class,args);
    }
}
