package com.github.kjtang.core.service;

import com.github.kjtang.core.entity.User;

/**
 * Created by kaijun on 2018/6/25.
 */
public interface UserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    User login(User user);

}
