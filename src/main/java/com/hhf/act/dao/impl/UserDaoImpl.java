package com.hhf.act.dao.impl;

import com.hhf.act.dao.UserDao;
import com.hhf.act.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by haohaifeng on 2017/4/25.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Session dao() {
        return sessionFactory.getCurrentSession();
    }

    public int save(User u) {
        Integer i = (Integer) dao().save(u);
        return i;
    }

    public List<User> findAll() {
        return dao().createCriteria(User.class).list();
    }
}
