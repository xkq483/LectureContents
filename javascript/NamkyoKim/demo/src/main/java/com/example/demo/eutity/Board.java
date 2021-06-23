package com.example.demo.eutity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Board {
    private int boardNo;
    private String title;
    // th:filed로 맵핑됨
    private String content;
    private String writer;
    private Date regDate;


}
