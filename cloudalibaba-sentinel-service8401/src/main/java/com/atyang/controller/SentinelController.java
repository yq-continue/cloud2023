package com.atyang.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @create 2023-05-17 16:19
 */
@RestController
public class SentinelController {

    @GetMapping("/sentinel/testA")
    public String testA(){
        return "---------------->testA";
    }
    @GetMapping("/sentinel/testB")
    public String testB(){
        return "---------------->testB";
    }

    @GetMapping("/sentinel/hotkey")
    @SentinelResource(value = "HotKey1",blockHandler = "Hot_Method")
    public String HotKey1(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "---------------test Hot Key";
    }

    public String Hot_Method(String p1, String p2, BlockException e){
        return "/(ㄒoㄒ)/~~ 失败了";
    }



}
