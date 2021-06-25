package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class PurchaseMember {



    private String id;
    private String pw;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;
    private String interest;
}