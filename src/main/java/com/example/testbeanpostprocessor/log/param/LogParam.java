package com.example.testbeanpostprocessor.log.param;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 20:08
 * @Version 1.0
 */
@Data
@Builder
public class LogParam {
    private String name;
    private String password;
}
