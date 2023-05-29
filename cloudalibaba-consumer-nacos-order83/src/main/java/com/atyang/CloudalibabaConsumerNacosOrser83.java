package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yang
 * @create 2023-05-15 21:17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConsumerNacosOrser83 {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConsumerNacosOrser83.class,args);
    }
}
