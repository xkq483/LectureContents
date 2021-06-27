package com.example.demo.repository;


import com.example.demo.entity.Board;
import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Customer customer) throws Exception {

        String query = "insert into customer (id, password, name, birth, adress, phone, email) values (?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(query,customer.getId(), customer.getPassword(), customer.getName(), customer.getBirth(), customer.getAdress(),
                customer.getPhone(),customer.getEmail());
    }
    public void login(Customer customer) throws Exception {

        List<Customer> results = jdbcTemplate.query(
                "select id, password from customer where id = ?",

                new RowMapper<Customer>() {
                    @Override
                    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Customer customer = new Customer();

                        customer.setId(rs.getString("id"));
                        customer.setPassword(rs.getString("password"));

                        return customer;
                    }
                }, customer.getId());

        Customer tmp = results.get(0);


        if (tmp.getPassword().equals(customer.getPassword())) {

        } else {

        }
    }
}
