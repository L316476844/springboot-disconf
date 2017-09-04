package org.jon.lv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;

/**
 * @Package org.jon.lv.DisconfApplication
 * @Description: DisconfApplication
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/8/18 9:30
 * version V1.0.0
 */
@SpringBootApplication
// 上使用@ServletComponentScan注解后，Servlet、Filter、Listener可以直接通过@WebServlet、@WebFilter、@WebListener注解自动注册，无需其他代码。
@ServletComponentScan(basePackages = "org.jon.lv")
@ImportResource({"classpath:config/application-*.xml"})//引入disconf
//@MapperScan("org.jon.lv.dao")
public class DisconfApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisconfApplication.class, args);
    }

    // 用于处理编码问题
    @Bean
    public Filter characterEncodingFilter() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }
}
