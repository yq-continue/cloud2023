package com.atyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yang
 * @create 2023-05-15 21:18
 */
@RestController
public class alibabaController {
    @Value("${service-url.nacos-user-service}")//http://nacos-payment-provider
    private String url;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/nacos/alibaba")
    public String alibaba(){
        return restTemplate.getForObject(url + "/nacos/alibaba",String.class);
    }

}
