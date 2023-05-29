package com.atyang.controller;

import com.atyang.entities.CommonResult;
import com.atyang.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yang
 * @create 2023-05-06 20:05
 */
@RestController
public class ConsumerController {
    public static final String CONSUMER_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/add")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(CONSUMER_URL + "/add",payment,CommonResult.class);
    }

    @GetMapping("/consumer/select/{id}")
    public CommonResult<Payment> select(@PathVariable Long id){
        return restTemplate.getForObject(CONSUMER_URL + "/select/" + id,CommonResult.class,id);
    }

    @GetMapping("/consumer/discoverClient")
    public DiscoveryClient discoveryClient(){
        return restTemplate.getForObject(CONSUMER_URL + "/discoverClient",DiscoveryClient.class);
    }


}
