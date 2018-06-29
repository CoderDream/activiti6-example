package com.github.kjtang.process.entity;

import com.github.kjtang.common.base.PageBaseEntity;
import lombok.Data;

/**
 * Created by kjtang on 2018/6/26.
 * 采购单
 */
@Data
public class Order extends PageBaseEntity{

    //采购单编号
    private String no;

    //采购单名称
    private String name;

    //采购金额
    private Float price;

}