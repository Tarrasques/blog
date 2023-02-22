package com.tarrasques.blog.interfaces.service;


import com.tarrasques.blog.commons.entity.AccessLogInfo;

import java.util.List;

public interface AccessLogInfoService {

    List select(AccessLogInfo info);

}
