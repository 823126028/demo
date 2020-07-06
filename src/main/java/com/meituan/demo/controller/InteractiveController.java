package com.meituan.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class InteractiveController {

    private static final Logger logger = LoggerFactory.getLogger(InteractiveController.class);
    @RequestMapping("/")
    public String sayHello() throws UnknownHostException {
        logger.info("hello, mcloud host:" + getHost());
        return "hello, mcloud";
    }
    @RequestMapping("/version")
    public String version() throws UnknownHostException {
       logger.info("mcloud:0.0.1 host:" + getHost());
        return "mcloud:0.0.1";
    }
    @RequestMapping("/errors")
    public String errors() throws UnknownHostException {
        logger.info("visit error host:" + getHost());
        return "mcloud:error:0.0.1";
    }

    private static String getHost() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return inetAddress.getHostName();
    }
}
