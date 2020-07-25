package com.wilsongibbs.searchsys.dao.impl;

import com.wilsongibbs.searchsys.dao.UserDao;
import com.wilsongibbs.searchsys.domain.User;
import com.wilsongibbs.searchsys.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }
}