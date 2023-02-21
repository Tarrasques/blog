package com.tarrasques.blog.gateway.controller;

import com.tarrasques.blog.commons.aspect.OperationLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class SystemController {

    @RequestMapping("")
    @OperationLog(operation = "测试")
    public String test() {
        return "test,world";
    }

}