package com.hhf.act.dao;

import com.hhf.act.model.User;

import java.util.List;

/**
 * Created by haohaifeng on 2017/4/25.
 */
public interface UserDao {
    public int save(User u);

    public List<User> findAll();
}
