package com.example.testbeanpostprocessor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 18:54
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfig {
    @Autowired
    private HttpMessageConverters fastJsonHttpMessageConverters;
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(fastJsonHttpMessageConverters.getConverters());
        return restTemplate;
    }


}
