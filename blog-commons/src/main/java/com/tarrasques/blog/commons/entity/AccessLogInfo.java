package com.tarrasques.blog.commons.entity;


import lombok.Data;

@Data
public class AccessLogInfo {

    private String id;
    private String userName;
    private String accessIp;

}