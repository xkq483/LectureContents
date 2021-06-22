package com.example.personalProject2.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
    private String id;
    private String pw;
    private int point;
}