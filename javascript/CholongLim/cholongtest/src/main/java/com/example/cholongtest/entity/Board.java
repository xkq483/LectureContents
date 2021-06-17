package com.example.cholongtest.entity;
// entity 핵심 데이터 관리
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.crypto.Data;

@Getter
@Setter
@ToString
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Data regData;



}
