package com.github.kjtang.core.entity;

import com.github.kjtang.common.base.PageBaseEntity;
import lombok.Data;

/**
 * Created by kaijun on 2018/7/1.
 */
@Data
public class Role extends PageBaseEntity{

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色标识
     */
    private String code;

    /**
     * 角色描述
     */
    private String description;
}