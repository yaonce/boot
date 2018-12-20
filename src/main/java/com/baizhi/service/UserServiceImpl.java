package com.baizhi.service;

import com.baizhi.dao.UserDAO_boot;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO_boot userDAO_boot;

    @Override
    public List<User> queryAll() {
        return userDAO_boot.queryAll();
    }

    @Override
    public void insert(User user) {
        userDAO_boot.insert(user);
    }

    @Override
    public void delete(User user) {
        userDAO_boot.delete(user);
    }

    @Override
    public void update(User user) {
        userDAO_boot.update(user);
    }

}
