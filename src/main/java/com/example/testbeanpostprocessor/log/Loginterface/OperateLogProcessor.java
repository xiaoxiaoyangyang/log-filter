package com.example.testbeanpostprocessor.log.Loginterface;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 19:33
 * @Version 1.0
 */
public interface OperateLogProcessor {
    /**
     * 请求预处理参数
     * 开始之前需要那些参数
     * @param request
     */
    default void preHandle(HttpServletRequest request) {
    }
    /**
     * 获取操作日志类型
     *
     * @return int
     */
    int getOperateLogType();

    /**
     * 执行插入操作日志处理
     *
     * @param accessToken
     * @param o
     */
    void process(String accessToken, Object o);


    /**
     * 执行插入操作日志处理
     *
     * @param request
     * @throws IOException
     */
    void process(HttpServletRequest request);
}
