package com.example.testbeanpostprocessor.log;

import com.example.testbeanpostprocessor.log.Loginterface.OperateLogProcesserFactory;
import com.example.testbeanpostprocessor.log.Loginterface.OperateLogProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 将对象放入到spring的容器当中
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 11:11
 * @Version 1.0
 */
@Service
public class LogBeanPostProcessor implements OperateLogProcesserFactory,BeanPostProcessor  {
   public Map<Integer,OperateLogProcessor> map=new HashMap<>();

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof OperateLogProcessor){
            OperateLogProcessor operateLogProcessor = (OperateLogProcessor) bean;
            map.put(operateLogProcessor.getOperateLogType(),operateLogProcessor);
        }
        return bean;
    }

    @Override
    public OperateLogProcessor getOperateLogProcessor(int type) {
        OperateLogProcessor operateLogProcessor = map.get(type);
        return operateLogProcessor;
    }
}
