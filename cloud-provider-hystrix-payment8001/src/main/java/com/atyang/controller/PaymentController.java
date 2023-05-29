package com.atyang.controller;

import com.atyang.service.PaymentServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yang
 * @create 2023-05-11 23:12
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @GetMapping("/hystrix/ok")
    public String Hystrix_OK(){
        return paymentService.testOk();
    }

    @GetMapping("/hystrix/timeout")
    public String Hystrix_TimeOut(){
        return paymentService.testDelay(3);
    }

    @HystrixCommand(fallbackMethod = "fallbackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="4000")
    })
    @GetMapping("/hystrix/fallback/{time}")
    public String fallback(@PathVariable("time") int time){
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "fallback 正常 O(∩_∩)O";
    }

    public String fallbackMethod(int a){
        return "fallback 异常 /(ㄒoㄒ)/~~";
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("****result: "+result);
        return result;
    }



}
