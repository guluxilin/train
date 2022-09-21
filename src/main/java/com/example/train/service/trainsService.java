package com.example.train.service;

import com.example.train.common.ResultVO;

public interface trainsService {
    public ResultVO addTrain(String name, String type);
    public ResultVO searchTrain(String name);
    public ResultVO deleteTrain(String name);
}
