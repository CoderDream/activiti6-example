package com.github.kjtang.core.service.impl;

import com.github.kjtang.core.entity.User;
import com.github.kjtang.core.mapper.UserMapper;
import com.github.kjtang.core.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kaijun on 2018/6/25.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User dbUser = userMapper.get(user);
        if(dbUser==null ) throw new RuntimeException("用户名或者密码错误");
        String dbPassword = dbUser.getPassword();
        String rawPassword = user.getPassword();
        if(!dbPassword.equals(rawPassword)){
            throw new RuntimeException("用户名或者密码错误");
        }
        dbUser.setPassword(null);
        return dbUser;
    }

    @Override
    public PageInfo<User> getUserPageList(User user) {
        PageHelper.startPage(1, 10);
        List<User> userList = userMapper.getList(user);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}
