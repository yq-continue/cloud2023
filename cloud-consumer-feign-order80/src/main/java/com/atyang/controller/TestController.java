package com.atyang.controller;

import com.atyang.entities.CommonResult;
import com.atyang.entities.Payment;
import com.atyang.service.ConvertPayment;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @create 2023-05-11 20:53
 */
@RestController
public class TestController {

    @Autowired
    private ConvertPayment convertPayment;

    @GetMapping("/consumer/select/{id}")
    public CommonResult<Payment> select(@PathVariable("id") Long id){
        return convertPayment.select(id);
    }
}
