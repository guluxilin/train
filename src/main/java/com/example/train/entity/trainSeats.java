package com.example.train.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="trainSeats")
public class trainSeats {
    @Id
    @Column(name="seat_id")
    private String seatId;
    @Column(name="train_id")
    private String trainId;
    @Column(name="carrige")
    private String carrige;
    @Column(name="seat_type")
    private String seatType;
    @Column(name="seat_position")
    private String seatPosition;
}
