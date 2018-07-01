package com.github.kjtang.common.response;

import com.github.kjtang.common.base.BaseEntity;
import lombok.Data;

/**
 * Created by kaijun on 2018/7/1.
 */
@Data
public class Response<T> {

    private Integer status;

    private String msg;

    private T data;

    public Response(){
        this.status = 0;
    }


}
