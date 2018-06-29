package com.github.kjtang.common.base;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by kjtang on 2018/6/25.
 */
@Data
public class BaseEntity implements Serializable{

    //主键
    private Long id;

    //创建时间
    private Timestamp createTime;

    //最后修改时间
    private Timestamp modifyTime;


}
