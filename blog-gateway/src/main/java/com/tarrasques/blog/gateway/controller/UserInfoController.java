package com.tarrasques.blog.gateway.controller;

import com.tarrasques.blog.commons.base.R;
import com.tarrasques.blog.commons.entity.UserInfo;
import com.tarrasques.blog.gateway.service.UserInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (UserInfo)表控制层
 *
 * @author makejava
 * @since 2023-02-28 15:33:56
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    @Resource
    private UserInfoService service;

    @RequestMapping("register")
    public ResponseEntity register(@RequestBody UserInfo userInfo){
        service.insert(userInfo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("login")
    public R login(){
        return null;
    }


}

