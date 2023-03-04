package org.example.springboot.controller;

import org.example.springboot.common.Result;
import org.example.springboot.entity.T_User;
import org.example.springboot.service.T_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class T_UserController {
    @Autowired
    private T_UserService tUserService;

    @GetMapping("/getTUser")
    public Result getT_User(int id) {
        T_User t_user1 = tUserService.selectUserOrderById1(id);
        T_User t_user2 = tUserService.selectUserOrderById2(id);
        System.out.println(t_user1);
        System.out.println(t_user2);
        return new Result(200, "查询成功", null);
    }
}
