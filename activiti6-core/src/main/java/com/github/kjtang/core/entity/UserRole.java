package com.github.kjtang.core.entity;

import com.github.kjtang.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * Created by kaijun on 2018/7/1.
 */
@Data
public class UserRole extends BaseEntity {

    //用户
    private User user;

    //角色
    private Role role;

}
