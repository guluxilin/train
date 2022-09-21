package com.example.train.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.*;

@Data
@Table(name="orders")
public class orders {
    @Id
    @Column(name="order_id")
    private String orderId;
    @Column(name="train_id")
    private String trainId;
    @Column(name="user_id")
    private String userId;
    @Column(name="seat_id")
    private String seatId;
    @Column(name="start_stop_id")
    private String startStopId;
    @Column(name="end_stop_id")
    private String endStopId;
    @Column(name="order_time")
    private String orderTime;
}
