package com.example.demo.repository;


import com.example.demo.entity.Board;
import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Customer customer) throws Exception {

        String query = "insert into customer (id, password, name, birth, adress, phone, email) values (?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query,customer.getId(), customer.getPassword(), customer.getName(), customer.getBirth(), customer.getAdress(),
                customer.getPhone(),customer.getEmail());
    }
}
