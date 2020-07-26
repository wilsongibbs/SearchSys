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

    @Override
    public User login(User user) {
        return dao.findUserByUsername(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void delUser(String id) {
        dao.delUser(Integer.parseInt(id));
    }

    @Override
    public User loadUser(String id) {
        return dao.loadUser(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void delSelected(String[] ids) {
        for (String id : ids) {
            dao.delUser(Integer.parseInt(id));
        }
    }
}
