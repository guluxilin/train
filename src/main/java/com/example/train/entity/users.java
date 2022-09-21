package com.example.train.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "users")
public class users {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_psw")
    private String userPsw;
    @Column(name = "user_level")
    private String userLevel;
}
