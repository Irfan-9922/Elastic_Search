package com.dss.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.client.RestTemplate;

import com.dss.model.User1;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        User1 user= restTemplate.getForObject("http://localhost:2020/curd/multtype/", User1.class);
        System.out.println(user.getName()+""+user.getId());
    }
}	