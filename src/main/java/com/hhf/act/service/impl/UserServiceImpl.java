package com.hhf.act.service.impl;

import com.hhf.act.dao.UserDao;
import com.hhf.act.model.User;
import com.hhf.act.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haohaifeng on 2017/4/25.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void saveusers(User u) {
        userDao.save(u);
    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}
