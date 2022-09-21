package com.example.train.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="train_states")
public class trainStates {
    @Column(name="train_id")
    private String trainId;
    @Column(name="train_date")
    private String trainDate;
    @Column(name="state")
    private String state;
}
