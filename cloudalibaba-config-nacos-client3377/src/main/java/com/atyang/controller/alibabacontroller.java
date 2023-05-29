package com.atyang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yang
 * @create 2023-05-15 21:58
 */
@RestController
@RefreshScope //在控制器类加入@RefreshScope注解使当前类下的配置支持Nacos的动态刷新功能。
public class alibabacontroller {
    @Value("${config.test}")
    private String config;

    @RequestMapping("/config")
    public String getConfig(){
        return config;
    }

}
