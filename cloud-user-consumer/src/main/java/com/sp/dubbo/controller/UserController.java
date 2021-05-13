package com.sp.dubbo.controller;

import com.lance.dubbo.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sgw
 * @date 2021/5/13 15:32
 */
@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "message",defaultValue = "no message")String message){
        return userService.dubboTest(message);
    }
}
