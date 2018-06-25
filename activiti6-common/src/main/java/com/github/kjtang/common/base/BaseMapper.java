package com.github.kjtang.common.base;

/**
 * Created by kjtang on 2018/6/25.
 */
public interface BaseMapper<T extends BaseEntity> {

    Long insert(T entity);

    void update(T entity);

    T get(T entity);

}
