package com.atyang.controller;

import com.atyang.entities.CommonResult;
import com.atyang.entities.Payment;
import com.atyang.service.Impl.PaymentServiceImpl;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author yang
 * @create 2023-05-05 22:25
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @Autowired
    private PaymentServiceImpl pay;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public CommonResult<Payment> add(@RequestBody Payment payment){
        int result = pay.create(payment);
        if (result > 0){
            return new CommonResult<>(200,"数据添加成功");
        }else {
            return new CommonResult<>(444,"数据添加失败");
        }
    }

    @GetMapping("/select/{id}")
    public CommonResult<Payment> select(@PathVariable("id") Long id){
        Payment payment = pay.selectById(id);
        if (payment == null){
            return new CommonResult<>(444,"未查询到数据，查询的数据id为：" + id + "port:" + port,null );
        }else {
            return new CommonResult<>(200,"查询成功，查询的数据为：" + id+ "port:" + port,payment);
        }
    }

    @GetMapping("/discoverClient")
    public Object discoverClient(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info(service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return discoveryClient;
    }
}
