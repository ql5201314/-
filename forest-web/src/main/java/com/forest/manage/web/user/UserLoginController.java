package com.forest.manage.web.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登录 Controller
 */
@RestController
public class UserLoginController {

    @RequestMapping("/hello.json")
    String home() {
        return "hello world";
    }
}
