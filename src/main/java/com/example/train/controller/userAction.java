package com.example.train.controller;

import com.example.train.common.ResultVO;
import com.example.train.entity.users;
import com.example.train.service.usersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.apache.struts2.convention.annotation.Action;

@Controller
@Namespace("/")
public class userAction extends ActionSupport implements ModelDriven<users> {
    @Autowired
    usersService userService;
    users user;
    public String userRegist()//注册用户
    {
        Integer level=(int)(Math.random()*3);
        String name=user.getUserName();
        String pwd=user.getUserPsw();//先通过后端表单输入的model获取注册信息
        user=(users)userService.userRegist(name,pwd,level.toString()).getData();//注册完后将user信息覆盖model传回页面
        System.out.println(user.getUserId());
        ActionContext ac = ActionContext.getContext();
        //从context中获取到值栈对象
        ValueStack stack = ac.getValueStack();
        //压栈，将值放入到栈中，前台取值时通过属性名即可获取
        stack.push(user);
        return "successRegist";
    }
    public String userLogin()//查找所有用户
    {
        String name=user.getUserName();
        String pwd=user.getUserPsw();//先通过后端表单输入的model获取注册信息
        if(userService.userLogin(name,pwd).getCode()==1000)//状态码为1000表明登录成功
        {
            return "successLogin";
        }
        return "failLogin";
    }

    @Override
    public users getModel() {
        if(user==null)
        {
            user=new users();
        }
        return user;
    }
}
