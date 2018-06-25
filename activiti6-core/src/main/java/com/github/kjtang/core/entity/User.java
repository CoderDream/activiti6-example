package com.github.kjtang.core.entity;

import com.github.kjtang.common.base.PageBaseEntity;
import lombok.Data;

/**
 * Created by kjtang on 2018/6/25.
 */
@Data
public class User extends PageBaseEntity{

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

}