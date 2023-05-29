package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yang
 * @create 2023-05-18 19:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaProviderPayment9004 {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9004.class,args);
    }
}
