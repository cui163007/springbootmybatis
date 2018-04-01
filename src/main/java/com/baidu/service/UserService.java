package com.baidu.service;

import com.baidu.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getList();

    public void addUser(User user);
}
