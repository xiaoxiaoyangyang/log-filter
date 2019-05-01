package com.example.testbeanpostprocessor.log.Loginterface;

import com.example.testbeanpostprocessor.log.param.LogParam;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 20:03
 * @Version 1.0
 */
public abstract class AbstractOperateLogProcessor implements OperateLogProcessor {
    public LogParam setLogParam(){
        LogParam build = LogParam.builder().name("").password("").build();
        return build;
    }

}
