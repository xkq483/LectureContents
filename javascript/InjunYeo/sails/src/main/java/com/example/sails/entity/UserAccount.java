package com.example.sails.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString

public class UserAccount {
    private int userNo;
    private String name;
    private String id;
    private String password;
    private String emali;
    private Date regDate;
}
