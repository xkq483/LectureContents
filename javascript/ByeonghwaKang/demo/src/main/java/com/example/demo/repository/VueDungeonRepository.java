package com.example.demo.repository;

import com.example.demo.entity.Dungeon;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@Repository

public class VueDungeonRepository {

    static final  int DUNGEON_NUM = 3;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Dungeon> randomlist() throws Exception {





        List<Dungeon> results = jdbcTemplate.query(
                "select dungeon_no, name, monsterLevel, description, exp, dropMoney, dropItem, reg_date " +
                        "from vuedungeon where dungeon_no > 0 order by dungeon_no desc",

                new RowMapper<Dungeon>() {
                    @SneakyThrows
                    @Override
                    public Dungeon mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Dungeon dungeon = new Dungeon();

                        dungeon.setDungeonNo(rs.getInt("dungeon_no"));
                        dungeon.setName(rs.getString("name"));
                        dungeon.setMonsterLevel(rs.getInt ("monsertLevel"));
                        dungeon.setDescription(rs.getString("description"));
                        dungeon.setExp((rs.getInt("exp")));
                        dungeon.setDropMoney((rs.getInt("dropMoney")));
                        dungeon.setDropItem(rs.getString("dropItem"));

                        dungeon.setRegDate(rs.getDate("reg_date"));

                        return dungeon;
                    }
                }
        );

        return results;
    }


}




