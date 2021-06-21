package com.example.demo.repository;

import com.example.demo.entity.DrawingPurchaseBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class DrawingPurchaseRepository {

    @Autowired
    private JdbcTemplate PurchaseJdbcTemplate;

    public void create(DrawingPurchaseBoard drawingPurchaseBoard) {
        String DrawingPurchaseBoardQuery = "insert into drawingPurchaseBoard(product_no, price, title, content, writer, createDate) values(?, ?, ?, ?, ?, ?)";
    }

    //  미완
}
