package com.example.testbeanpostprocessor.log.Loginterface;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 19:48
 * @Version 1.0
 */
public interface OperateLogProcesserFactory {
    /**
     * 获取操作日志处理器
     *
     * @param type
     * @return OperateLogProcessor
     */
    OperateLogProcessor getOperateLogProcessor(int type);

}
