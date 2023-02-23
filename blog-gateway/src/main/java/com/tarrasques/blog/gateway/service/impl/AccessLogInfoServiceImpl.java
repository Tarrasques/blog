package com.tarrasques.blog.gateway.service.impl;

import com.tarrasques.blog.commons.entity.AccessLogInfo;
import com.tarrasques.blog.gateway.mapper.AccessLogInfoMapper;
import com.tarrasques.blog.gateway.service.AccessLogInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AccessLogInfoService")
public class AccessLogInfoServiceImpl implements AccessLogInfoService {

    @Resource
    private AccessLogInfoMapper mapper;

    @Override
    public List select(AccessLogInfo info) {
        return mapper.select(info);
    }

}