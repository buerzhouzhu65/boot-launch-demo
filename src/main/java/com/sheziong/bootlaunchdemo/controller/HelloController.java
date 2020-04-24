package com.sheziong.bootlaunchdemo.controller;

import com.sheziong.bootlaunchdemo.model.LombokPOJO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    LombokPOJO lombokPOJO = new LombokPOJO("shezhifeng", 27);

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world, " +lombokPOJO;
    }
}