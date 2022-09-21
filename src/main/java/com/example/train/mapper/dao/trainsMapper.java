package com.example.train.mapper.dao;

import com.example.train.entity.orders;
import com.example.train.entity.trains;
import com.example.train.mapper.general.generalDAO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface trainsMapper extends generalDAO<trains> {
}
