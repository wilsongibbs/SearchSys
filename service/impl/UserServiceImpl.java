package com.wilsongibbs.searchsys.service.impl;

import com.wilsongibbs.searchsys.dao.UserDao;
import com.wilsongibbs.searchsys.dao.impl.UserDaoImpl;
import com.wilsongibbs.searchsys.domain.PageBean;
import com.wilsongibbs.searchsys.domain.User;
import com.wilsongibbs.searchsys.service.UserService;

import java.util.List;
import java.util.Map;

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

    @Override
    public PageBean<User> getPage(int currentPage, int rows, Map<String, String[]> condition) {
        PageBean<User> pageBean = new PageBean<User>();
        pageBean.setCurrentPage(currentPage);
        pageBean.setRows(rows);
        int totalCount = dao.countTotal(condition);
        pageBean.setTotalCount(totalCount);
        int start = (currentPage - 1) * rows;
        pageBean.setList(dao.getPage(start,rows,condition));
        int totalPage = totalCount % rows == 0 ? totalCount/rows : totalCount/rows + 1;
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }
}
