package com.atyang.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yang
 * @create 2023-05-09 21:41
 */
@RestController
public class TestController {

    public static final String URL_PREFIX = "http://provider-consul-8006/";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/consul/test")
    public String test(){
        String forObject = restTemplate.getForObject(URL_PREFIX + "consul/test",String.class);
        return forObject;
    }

}
