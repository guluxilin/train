package com.example.train.mapper.dao;

import com.example.train.entity.orders;
import com.example.train.entity.trainSeats;
import com.example.train.mapper.general.generalDAO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface trainSeatsMapper extends generalDAO<trainSeats> {
}
