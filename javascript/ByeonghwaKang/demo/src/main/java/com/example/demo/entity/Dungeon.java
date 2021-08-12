package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Dungeon {
    private Integer DungeonNo;
    private Integer monsterLevel;
    private String name;
    private String description;
    private Integer exp;
    private Integer dropMoney;
    private String dropItem;
    private Date regDate;
}



