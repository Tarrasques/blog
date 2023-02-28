package com.tarrasques.blog.gateway.controller;

import com.tarrasques.blog.gateway.service.RoleInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (RoleInfo)表控制层
 *
 * @author makejava
 * @since 2023-02-28 15:56:17
 */
@RestController
@RequestMapping("roleInfo")
public class RoleInfoController {

    /**
     * 服务对象
     */
    @Resource
    private RoleInfoService roleInfoService;

}
