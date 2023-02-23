package com.tarrasques.blog.gateway.service;

import com.tarrasques.blog.commons.entity.AccessLogInfo;

import java.util.List;

public interface AccessLogInfoService {

    List select(AccessLogInfo info);
    void insertAccessLog(AccessLogInfo info);

}
