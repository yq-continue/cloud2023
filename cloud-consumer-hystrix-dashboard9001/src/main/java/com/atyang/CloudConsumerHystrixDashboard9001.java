package com.atyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author yang
 * @create 2023-05-13 10:53
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001.class,args);
    }

}
