package com.tarrasques.blog.interfaces.service.impl;


import com.tarrasques.blog.commons.entity.AccessLogInfo;
import com.tarrasques.blog.interfaces.mapper.AccessLogInfoMapper;
import com.tarrasques.blog.interfaces.service.AccessLogInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccessLogInfoServiceImpl implements AccessLogInfoService {

    @Resource
    private AccessLogInfoMapper infoMapper;

    @Override
    public List select(AccessLogInfo info) {
        return infoMapper.select(info);
    }

}
