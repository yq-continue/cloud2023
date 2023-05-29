package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yang
 * @create 2023-05-09 21:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulOrder80.class,args);
    }

}
