package com.wilsongibbs.searchsys.service;

import com.wilsongibbs.searchsys.domain.PageBean;
import com.wilsongibbs.searchsys.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<User> finaAll();

    public User login(User user);

    public void addUser(User user);

    public void delUser(String id);

    public User loadUser(String id);

    public void updateUser(User user);

    public void delSelected(String[] ids);

    PageBean<User> getPage(int currentPage, int rows, Map<String, String[]> condition);
}
