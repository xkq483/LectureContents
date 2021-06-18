package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Board {
    private int boardNo;
    //th:field로 매핑된다
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
