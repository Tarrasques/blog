package com.tarrasques.blog.gateway.mapper;


import com.tarrasques.blog.commons.entity.AccessLogInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccessLogInfoMapper {

    List<AccessLogInfo> select(AccessLogInfo info);
    int insertAccessLog(AccessLogInfo info);

}