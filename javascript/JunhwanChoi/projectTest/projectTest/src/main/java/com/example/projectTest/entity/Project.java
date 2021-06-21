package com.example.projectTest.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Project {

    private int projectNo;
    private String name;
    private int price;
    private String description;
    private Date regDate;

}

