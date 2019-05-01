package com.example.testbeanpostprocessor.service;

import com.example.testbeanpostprocessor.entity.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 19:38
 * @Version 1.0
 */
public class CatBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Cat){
            Cat cat = (Cat) bean;
            cat.say();
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Cat){
            Cat cat = (Cat) bean;
            cat.setName("xiao hua hua");
            cat.setAge(10);
        }
        return null;
    }
}
