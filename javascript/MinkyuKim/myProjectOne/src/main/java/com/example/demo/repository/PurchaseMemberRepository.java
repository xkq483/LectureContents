package com.example.demo.repository;

import com.example.demo.entity.PurchaseMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PurchaseMemberRepository {

    @Autowired
    private JdbcTemplate JdbcTemplate;


    public void purchasingSignUpCreate(PurchaseMember purchaseMember) throws Exception {

        String Query = "insert into purchasingMemberSignUp (id, pw, name, dateOfBirth, gender, phoneNumber, email, address, interest) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";



        JdbcTemplate.update(Query, purchaseMember.getId(), purchaseMember.getPw(), purchaseMember.getName(),
                purchaseMember.getDateOfBirth(), purchaseMember.getGender(), purchaseMember.getPhoneNumber(),
                purchaseMember.getEmail(), purchaseMember.getAddress(), purchaseMember.getInterest());


    }
}
