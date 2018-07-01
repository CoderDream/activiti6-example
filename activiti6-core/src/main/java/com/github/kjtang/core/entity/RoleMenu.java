package com.github.kjtang.core.entity;

import com.github.kjtang.common.base.BaseEntity;
import lombok.Data;

/**
 * Created by kaijun on 2018/7/1.
 */
@Data
public class RoleMenu extends BaseEntity {

    private Role role;

    private Menu menu;
}
