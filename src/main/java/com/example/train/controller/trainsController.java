package com.example.train.controller;

import com.example.train.common.ResultVO;
import com.example.train.service.trainsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/trains")
public class trainsController {
    @Autowired
    trainsService trainService;
    @PostMapping("/addTrain")
    public ResultVO addTrain(String name, String type)
    {
        return trainService.addTrain(name,type);
    }
    @GetMapping("/searchTrain")
    public ResultVO searchTrain(String name)
    {
        return trainService.searchTrain(name);
    }
    @PostMapping("/deleteTrain")
    public ResultVO deleteTrain(String name)
    {
        return trainService.deleteTrain(name);
    }
}
