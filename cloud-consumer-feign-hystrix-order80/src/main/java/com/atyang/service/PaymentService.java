package com.atyang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yang
 * @create 2023-05-11 23:36
 */
@Service
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = FallBack.class)
public interface PaymentService {

    @GetMapping("/hystrix/ok")
    public String Hystrix_OK();

    @GetMapping("/hystrix/timeout")
    public String Hystrix_TimeOut();

    @GetMapping("/hystrix/fallback/{time}")
    public String fallback(@PathVariable("time") int time);

}
