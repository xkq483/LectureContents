package com.example.membershiptest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class Member {
    private int boardNo;
    private String title;
    protected String content;
    protected String writer;
    private Date regDate;

}
