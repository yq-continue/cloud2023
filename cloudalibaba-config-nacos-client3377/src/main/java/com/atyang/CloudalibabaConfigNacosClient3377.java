package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yang
 * @create 2023-05-15 21:57
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaConfigNacosClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConfigNacosClient3377.class,args);
    }
}
