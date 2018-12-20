package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();
    void insert(User user);
    void delete(User user);
    void update(User user);
}
