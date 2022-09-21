package com.example.train.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="train_stops")
public class trainStops {
    @Id
    @Column(name="stop_id")
    private String stopId;
    @Column(name="train_id")
    private String trainId;
    @Column(name="arrive_time")
    private String arriveTime;
    @Column(name="stop_time")
    private String stopTime;
    @Column(name="distance")
    private Integer distance;
}
