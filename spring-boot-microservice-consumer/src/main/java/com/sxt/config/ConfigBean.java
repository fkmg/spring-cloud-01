package com.sxt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /*
     *相当于在applicationContext.xml中配置了restTemplate信息
     *<bean id="restTemplate" class=".....">
     */
    @Bean
    public RestTemplate getRestTemplate(){
        /*Spring提供的一个做rest操作的工具类,提供了一些方法发送rest请求,类似与
        JdbcTemplate/SqlSessionTemplete*/
        return new RestTemplate();
    }
}
