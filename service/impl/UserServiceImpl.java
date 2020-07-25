package com.wilsongibbs.searchsys.service.impl;

import com.wilsongibbs.searchsys.dao.UserDao;
import com.wilsongibbs.searchsys.dao.impl.UserDaoImpl;
import com.wilsongibbs.searchsys.domain.User;
import com.wilsongibbs.searchsys.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> finaAll() {
        return dao.findAll();
    }
}