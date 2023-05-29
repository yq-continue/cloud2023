package com.atyang.controller;

import com.atyang.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @create 2023-05-11 23:37
 */
@RestController
//@DefaultProperties(defaultFallback = "fallbackMethod")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;
    @GetMapping("/consumer/hystrix/ok")
    public String Hystrix_OK(){
        return paymentService.Hystrix_OK();
    }

    @GetMapping("/consumer/hystrix/timeout")
    public String Hystrix_TimeOut(){
        return paymentService.Hystrix_TimeOut();
    }

    @HystrixCommand
    @GetMapping("/consumer/hystrix/fallback/{time}")
    public String fallback(@PathVariable("time") int time){
//        int a = 10 / 0;
        return paymentService.fallback(time);
    }

    public String fallbackMethod(){
        return "123 fallback 异常 /(ㄒoㄒ)/~~";
    }
}
