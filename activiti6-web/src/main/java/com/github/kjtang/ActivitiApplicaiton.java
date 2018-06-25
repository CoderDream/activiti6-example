package com.github.kjtang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kjtang on 2018/6/25.
 */
@SpringBootApplication
@MapperScan("com.github.kjtang.*.mapper")
public class ActivitiApplicaiton {

    public static void main(String[] args){
        SpringApplication.run(ActivitiApplicaiton.class,args);
    }

}