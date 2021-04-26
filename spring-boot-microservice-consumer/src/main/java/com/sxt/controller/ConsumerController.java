package com.sxt.controller;

import com.sxt.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${provider_rest_uri_prefix}")
    private String provider_rest_uri_prefix;

    @RequestMapping(value="/consumer/user/{id}",method= RequestMethod.GET)
    public User getUser(@PathVariable Integer id){
        return restTemplate.getForObject(provider_rest_uri_prefix+"/user/"+id, User.class);
    }
}
