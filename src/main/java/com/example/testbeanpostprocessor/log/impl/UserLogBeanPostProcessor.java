package com.example.testbeanpostprocessor.log.impl;

import com.example.testbeanpostprocessor.log.Loginterface.AbstractOperateLogProcessor;
import com.example.testbeanpostprocessor.service.LogService;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

import static com.example.testbeanpostprocessor.log.impl.OperateLogType.USER_ADD;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 20:09
 * @Version 1.0
 */
@Service
public class UserLogBeanPostProcessor extends AbstractOperateLogProcessor {
    @Autowired
    private LogService logService;

    @Override
    public int getOperateLogType() {
        return USER_ADD.getType();
    }

    @Override
    public void process(String accessToken, Object o) {
        logService.insert(accessToken,o);
    }

    @Override
    public void process(HttpServletRequest request) {
        String accessToken = request.getParameter("name");
        String password = request.getParameter("password");
        process(accessToken,password);
    }
}
