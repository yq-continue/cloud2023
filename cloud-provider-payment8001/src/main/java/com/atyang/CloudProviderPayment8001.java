package com.atyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yang
 * @create 2023-05-07 12:51
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.atyang.dao")
public class CloudProviderPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001.class,args);
    }
}
