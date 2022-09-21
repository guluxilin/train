package com.example.train.entity;

import lombok.Data;
import javax.persistence.*;
@Data
@Table(name="trains")
public class trains {
    @Id
    @Column(name="train_id")
    private String trainId;
    @Column(name="train_name")
    private String trainName;
    @Column(name="train_type")
    private String trainType;

}
