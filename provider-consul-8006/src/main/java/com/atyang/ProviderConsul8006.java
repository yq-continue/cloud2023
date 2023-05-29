package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yang
 * @create 2023-05-09 21:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsul8006 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConsul8006.class,args);
    }
}
