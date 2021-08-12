package com.example.projecttest.repository;

import com.example.projecttest.entity.Product;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@Slf4j
@Repository


public class ProjectRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void create(Product product) {
        String query = "insert into product (name, price, description) values (?, ?, ?)";

        jdbcTemplate.update(query, product.getName(), product.getPrice(), product.getDescription());
    }

    public List<Product> list() throws Exception {
        List<Product> results = jdbcTemplate.query(
                "select product_no, name, price, description, reg_date from product " +
                        "where product_no > 0 order by product_no desc",
                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setProductNo(rs.getInt("product_no"));
                        product.setName(rs.getString("name"));
                        product.setPrice(rs.getInt("price"));
                        product.setDescription(rs.getString("description"));

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        product.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        return product;
                    }
                }
        );

        return results;
    }
}


