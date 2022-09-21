package com.example.train.service;

import com.example.train.common.ResultVO;

public interface usersService {
    public ResultVO userRegist(String name, String pwd, String level);
    public ResultVO userCheck();
    public ResultVO userLogin(String name, String pwd);
}
