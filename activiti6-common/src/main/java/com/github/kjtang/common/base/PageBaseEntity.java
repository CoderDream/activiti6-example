package com.github.kjtang.common.base;

import lombok.Data;

/**
 * Created by kjtang on 2018/6/25.
 */
@Data
public class PageBaseEntity extends BaseEntity{

    /**
     * 当前页码
     */
    private Integer curPage;

    /**
     * 每一页的记录数
     */
    private Integer pageSize;
}
