package com.example.testbeanpostprocessor;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 20:30
 * @Version 1.0
 */
public enum OperateLogType {
    USER_ADD(1);
    private Integer type;
    private OperateLogType(Integer type){
        this.type=type;
    }
    public Integer getType(Integer type){
        return type;
    }
}
