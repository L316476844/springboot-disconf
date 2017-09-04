package org.jon.lv.controller;

import org.jon.lv.bean.PropertiesBean;
import org.jon.lv.conf.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package org.jon.lv.controller.HelloController
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/18 9:33
 * version V1.0.0
 */
@RestController
public class HelloController {

    /**
     * 开原作者提供方式
     */
    @Autowired
    private AppConfig appConfig;

    @Autowired
    private PropertiesBean propertiesBean;

    /**
     * spring 获取配置的方式
     */
    @Value("${app.host}")
    private String host;

    @GetMapping("/app")
    public String app(){
        return "hello world-------" + appConfig.getHost() + ":" + appConfig.getPort();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world-------" + propertiesBean.getHost() + ":" + propertiesBean.getPort();
    }

    @GetMapping("val")
    public String val(){
        return "---------------" + host;
    }
}
