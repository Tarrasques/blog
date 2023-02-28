package com.tarrasques.blog.gateway.controller;

import com.tarrasques.blog.commons.base.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("register")
    public R register(){
        return null;
    }

}
