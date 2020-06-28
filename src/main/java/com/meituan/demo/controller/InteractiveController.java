package com.meituan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InteractiveController {
    @RequestMapping("/")
    public String sayHello() {
        return "hello, mcloud";
    }
    @RequestMapping("/version")
    public String version() {
        return "mcloud:0.0.1";
    }
}
