package com.tarrasques.blog.gateway.mapper;


import com.tarrasques.blog.commons.entity.AccessLogInfo;

import java.util.List;

public interface AccessLogInfoMapper {

    List select(AccessLogInfo info);
    int insertAccessLog(AccessLogInfo info);

}