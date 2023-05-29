package com.atyang.controller;

import com.atyang.service.impl.OutPutServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yang
 * @create 2023-05-14 15:27
 */
@RestController
public class OutPutController {

    @Resource
    private OutPutServiceImpl service;


    @GetMapping("/rabbitmq")
    public String send(){
        return service.send();
    }
}
