package com.baidu.service.impl;

import com.baidu.mapper.UserMapper;
import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

@Autowired
private UserMapper userMapper;

    @Override
    public List<User> getList() {
        return userMapper.getList();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
