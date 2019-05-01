package com.example.testbeanpostprocessor;

import java.lang.annotation.*;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 20:46
 * @Version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface LogAnnation {
    OperateLogType operateLogType();
}
