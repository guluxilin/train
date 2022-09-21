package com.example.train.service.impl;

import com.example.train.common.ResultVO;
import com.example.train.entity.trains;
import com.example.train.entity.users;
import com.example.train.mapper.dao.trainsMapper;
import com.example.train.mapper.dao.usersMapper;
import com.example.train.service.trainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.UUID;

@Service
public class trainsServiceImpl implements trainsService {
    @Autowired
    private trainsMapper trainMapper;
    public ResultVO addTrain(String name, String type)
    {
        Example example =new Example(trains.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("trainName",name);
        List<trains> trains =trainMapper.selectByExample(example);
        if(trains.size()==0)//没有用户名相同的则可以注册
        {
            trains train = new trains();
            train.setTrainId( UUID.randomUUID().toString().replaceAll("-",""));//UUID生成唯一ID
            train.setTrainName(name);
            train.setTrainType(type);
            int i = trainMapper.insert(train);
            if (i > 0)
                return new ResultVO(1000, "添加列车信息成功", train);
            else
                return new ResultVO(1002, "添加失败", null);
        }
        else
        {
            return new ResultVO(1001, "已有该列车", null);
        }
    }
    public ResultVO searchTrain(String name)
    {
        Example example =new Example(trains.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("trainName",name);
        List<trains> trains =trainMapper.selectByExample(example);
        if(trains.size()==0)
            return new ResultVO(1002, "找不到目标列车", null);
        else
            return new ResultVO(10002, "查找成功", trains);
    }
    public ResultVO deleteTrain(String name)
    {
        Example example =new Example(trains.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("trainName",name);
        int i=trainMapper.deleteByExample(example);
        if(i>0)
            return new ResultVO(1000, "删除成功", null);
        else
            return new ResultVO(1002, "删除失败", null);
    }
}
