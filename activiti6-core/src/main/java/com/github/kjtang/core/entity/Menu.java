package com.github.kjtang.core.entity;

import com.github.kjtang.common.base.PageBaseEntity;
import lombok.Data;

/**
 * Created by kaijun on 2018/7/1.
 */
@Data
public class Menu extends PageBaseEntity {

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单类型：1表示目录;2表示菜单;3表示按钮或链接
     */
    private Integer type;

    /**
     * 菜单链接
     */
    private String url;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序序号
     */
    private Integer orderNum;

    /**
     * 是否禁用
     */
    private Integer disabled;

}
