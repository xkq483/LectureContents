package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class SignUpBoard {
    private String id;
    private String pw;
    private String name;
    private int phoneNumber;
    private String em;
    private String address;
}