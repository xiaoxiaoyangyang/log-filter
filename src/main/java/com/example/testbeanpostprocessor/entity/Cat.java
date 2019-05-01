package com.example.testbeanpostprocessor.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 11:09
 * @Version 1.0
 */
@Component
@Data
public class Cat {
    private String name="xiaohua";

    private int age=2;

    public void say() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}
