package com.example.train.controller;

import com.example.train.common.ResultVO;
import com.example.train.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class usersController {
    @Autowired
    usersService userService;
    @PostMapping("/regist")
    public ResultVO userRegist(String name, String pwd)//注册用户
    {
        Integer level=(int)(Math.random()*3);
        return userService.userRegist(name,pwd,level.toString());
    }
    @GetMapping("/check")
    public ResultVO userCheck()//查找所有用户
    {
        return userService.userCheck();
    }
    @GetMapping("/login")
    public ResultVO userLogin(String name,String pwd)//用户登录
    {
        return userService.userLogin(name,pwd);
    }
}
