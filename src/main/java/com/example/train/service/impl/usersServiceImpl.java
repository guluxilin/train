package com.example.train.service.impl;

import com.example.train.common.ResultVO;
import com.example.train.entity.users;
import com.example.train.mapper.dao.usersMapper;
import com.example.train.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.UUID;

@Service
public class usersServiceImpl implements usersService {
    @Autowired
    private usersMapper userMapper;
    public ResultVO userRegist(String name,String pwd,String level)
    {
        Example example =new Example(users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName",name);
        List<users> users =userMapper.selectByExample(example);
        if(users.size()==0)//没有用户名相同的则可以注册
        {
            users user = new users();
            user.setUserId( UUID.randomUUID().toString().replaceAll("-",""));//UUID生成唯一ID
            user.setUserName(name);
            user.setUserPsw(pwd);
            user.setUserPsw(level);
            int i = userMapper.insert(user);
            if (i > 0)
                return new ResultVO(1000, "注册成功", user);
            else
                return new ResultVO(1002, "注册失败", user);
        }
        else
        {
            return new ResultVO(1001, "用户名已被注册", null);
        }
    }
    public ResultVO userCheck()
    {
        List<users> users =userMapper.selectAll();
        return new ResultVO(1000, "查找成功", users);
    }
    public ResultVO userLogin(String name, String pwd)
    {
        Example example =new Example(users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName",name);
        criteria.andEqualTo("userPsw",pwd);
        List<users> users =userMapper.selectByExample(example);
        if(users.size()==1)
        return new ResultVO(1000, "登录成功", users.get(0));
        else
            return new ResultVO(1002, "用户名或密码错误", null);
    }
}
