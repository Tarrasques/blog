package com.tarrasques.blog.gateway.controller;

import com.tarrasques.blog.commons.aspect.OperationLog;
import com.tarrasques.blog.commons.entity.AccessLogInfo;
import com.tarrasques.blog.gateway.service.AccessLogInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("test")
public class SystemController {

    @Resource
    private AccessLogInfoService service;

    @RequestMapping("")
    @OperationLog(operation = "测试")
    public List test() {
        List select = service.select(new AccessLogInfo());
        return select;
    }

}