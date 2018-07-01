package com.github.kjtang.common.base;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by kjtang on 2018/6/25.
 */
@Data
public class BaseEntity implements Serializable{

    public static Integer DELETE_YES = 1;
    public static Integer DELETE_NO = 0;

    //主键
    private Long id;

    //创建时间
    private Timestamp createTime;

    //最后修改时间
    private Timestamp modifyTime;

    //是否删除
    private Integer deleted;

}
