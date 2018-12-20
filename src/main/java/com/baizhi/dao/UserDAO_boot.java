package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO_boot {
    List<User> queryAll();
    void insert(User user);
    void delete(User user);
    void update(User user);
}
