package com.wilsongibbs.searchsys.dao;

import com.wilsongibbs.searchsys.domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public User findUserByUsername(String username, String password);
}
