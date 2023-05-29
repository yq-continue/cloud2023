package com.atyang.controller;

import com.atyang.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @create 2023-05-27 23:37
 */
@RestController
@Slf4j
public class TestController {
    User user = new User("test",1,"java");
    int count = 0;

    @RequestMapping("/getuser")
    public User getUser(){
        count++;
        log.info("请求进入：{}",count);
        System.out.println("分支测试！！！");
        System.out.println("test" + "分支测试！！！");
        return user;
    }
}
