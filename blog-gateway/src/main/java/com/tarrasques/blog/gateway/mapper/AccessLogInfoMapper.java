package com.tarrasques.blog.interfaces.mapper;


import com.tarrasques.blog.commons.entity.AccessLogInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccessLogInfoMapper {

    List select(AccessLogInfo info);

}