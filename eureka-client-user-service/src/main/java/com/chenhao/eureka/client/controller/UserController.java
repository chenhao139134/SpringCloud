package com.chenhao.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: UserController.java
 * Author:   chenhao
 * Date:     2020/7/19 2:29
 * Description:
 */
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String hello(){
        return "Hello Spring Cloud.";
    }
}