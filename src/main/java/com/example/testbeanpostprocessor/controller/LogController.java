package com.example.testbeanpostprocessor.controller;

import com.example.testbeanpostprocessor.LogAnnation;
import com.example.testbeanpostprocessor.OperateLogType;
import com.example.testbeanpostprocessor.log.param.LogParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 20:50
 * @Version 1.0
 */
@RestController
public class LogController {

    @PostMapping("insert")
    @LogAnnation(operateLogType=OperateLogType.USER_ADD)
    public ResponseEntity<?> insert(@RequestBody LogParam logParam){
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }
}
