package com.atyang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yang
 * @create 2023-05-09 21:33
 */
@RestController
@Slf4j
public class Test {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/consul/test",method = RequestMethod.GET)
    public String test(){
        return "springcloud with consul: "+serverPort+"\t\t"+ UUID.randomUUID().toString();
    }

}
