package com.atyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @create 2023-05-15 21:06
 */
@RestController
public class AlibabaController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/nacos/alibaba")
    public String alibaba(){
        return "this is springcloudalibaba test! port: " + port;
    }

}
