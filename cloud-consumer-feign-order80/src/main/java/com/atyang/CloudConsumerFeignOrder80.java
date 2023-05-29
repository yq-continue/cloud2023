package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yang
 * @create 2023-05-11 20:46
 */
@SpringBootApplication(scanBasePackages = "com.atyang")
@EnableFeignClients
public class CloudConsumerFeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80.class,args);
    }
}
