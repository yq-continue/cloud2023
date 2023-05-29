package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yang
 * @create 2023-05-11 23:34
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudConsumerFeignHystrixOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80.class,args);
    }

}
