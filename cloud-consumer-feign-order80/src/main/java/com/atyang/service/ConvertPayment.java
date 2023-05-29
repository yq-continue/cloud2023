package com.atyang.service;

import com.atyang.entities.CommonResult;
import com.atyang.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yang
 * @create 2023-05-11 20:48
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface ConvertPayment {
    @GetMapping("/select/{id}")
    CommonResult<Payment> select(@PathVariable("id") Long id);
}
