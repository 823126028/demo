package com.meituan.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InteractiveController {

    private static final Logger logger = LoggerFactory.getLogger(InteractiveController.class);
    @RequestMapping("/")
    public String sayHello() {
        logger.info("hello, mcloud");
        return "hello, mcloud";
    }
    @RequestMapping("/version")
    public String version() {
       logger.info("mcloud:0.0.1");
        return "mcloud:0.0.1";
    }
}
