package com.example.demo.repository;

import com.example.demo.entity.PurchasingSignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PurchasingSignUpRepository {

    @Autowired
    private JdbcTemplate signUpJdbcTemplate;


    public void purchasingSignUpCreate(PurchasingSignUp purchasingSignUp) throws Exception {

        String SignUpQuery = "insert into purchasingMemeberSignUp (id, pw, name, dateOfBirth, gender, phoneNumber, email, address, interest) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";


        signUpJdbcTemplate.update(SignUpQuery, purchasingSignUp.getId(), purchasingSignUp.getPw(), purchasingSignUp.getName(),
                purchasingSignUp.getDateOfBirth(), purchasingSignUp.getGender(), purchasingSignUp.getPhoneNumber(),
                purchasingSignUp.getEmail(), purchasingSignUp.getAddress(), purchasingSignUp.getInterest());


    }
}
