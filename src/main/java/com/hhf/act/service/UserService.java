package com.hhf.act.service;

import com.hhf.act.model.User;

import java.util.List;

/**
 * Created by haohaifeng on 2017/4/25.
 */
public interface UserService {
    public void saveusers(User u);
    public List<User> getAllUsernames();
}
