package com.example.train.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="staions")
public class stations {
    @Id
    @Column(name="stop_id")
    private String stopId;
    @Column(name="city_name")
    private String cityName;
    @Column(name="station_name")
    private String stationName;
}
