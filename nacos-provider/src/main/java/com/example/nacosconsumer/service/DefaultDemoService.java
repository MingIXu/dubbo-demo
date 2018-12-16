package com.example.nacosconsumer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.DemoService;

@Service(version = "${demo.service.version}")
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}