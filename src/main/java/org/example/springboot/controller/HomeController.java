package org.example.springboot.controller;

import org.example.springboot.common.Result;
import org.example.springboot.entity.User;
import org.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bailiang
 */
@RestController
public class HomeController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        System.out.println("login");
        try {
            return new Result(200, "登陆成功!", user.getUserName());
        } catch (Exception e) {
            return new Result(400, "登陆失败!", user.getUserName());
        }
    }
}
