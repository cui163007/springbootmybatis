package com.baidu.mapper;

import com.baidu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    public List<User> getList();

    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void addUser(User user);
}
