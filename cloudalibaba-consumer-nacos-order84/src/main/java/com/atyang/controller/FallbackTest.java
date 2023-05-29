package com.atyang.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.atyang.entities.CommonResult;
import com.atyang.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yang
 * @create 2023-05-18 19:27
 */
@RestController
public class FallbackTest {

    public static final String URL = "http://nacos-payment-provider";//nacos-payment-provider

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/paymentSQL/{id}")
    @SentinelResource(value = "sentinel",fallback = "FallbackHandle")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        CommonResult common = restTemplate.getForObject(URL + "/paymentSQL/" + id, CommonResult.class, id);
        if (id == 4){
            throw new NullPointerException("空指针异常");
        }
        return common;
    }

    public CommonResult<Payment> FallbackHandle(@PathVariable("id") Long id,Throwable e){
        Payment payment = new Payment(id,"null");
        return new CommonResult<>(444,"兜底异常handlerFallback,exception内容  "+e.getMessage(),payment);

    }
}
