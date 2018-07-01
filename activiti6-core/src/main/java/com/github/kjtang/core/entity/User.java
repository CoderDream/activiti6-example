package com.github.kjtang.core.entity;

import com.github.kjtang.common.base.PageBaseEntity;
import lombok.Data;

import java.util.Date;

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

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String photo;

    /**
     * 真实姓名
     */
    private String realName;


}