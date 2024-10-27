package com.zzj.git.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangzhijun
 * @create 2024-10-27-10:09
 */

@RestController
public class HomeController {

    @RequestMapping("/")
    public String homeGreeting() {
        return "hello world";
    }

    @RequestMapping("/test")
    public String test() {
        return "test method";
    }
}
