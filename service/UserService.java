package com.wilsongibbs.searchsys.service;

import com.wilsongibbs.searchsys.domain.User;

import java.util.List;

public interface UserService {
    public List<User> finaAll();

    public User login(User user);

    public void addUser(User user);
}
