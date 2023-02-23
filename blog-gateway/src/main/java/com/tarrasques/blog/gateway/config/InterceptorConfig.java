package com.tarrasques.blog.gateway.config;

import cn.hutool.extra.servlet.ServletUtil;
import com.tarrasques.blog.commons.entity.AccessLogInfo;
import com.tarrasques.blog.gateway.service.impl.AccessLogInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

@Component
public class InterceptorConfig implements HandlerInterceptor, Ordered {

    @Resource
    private AccessLogInfoServiceImpl service;

    private Logger log = LoggerFactory.getLogger(InterceptorConfig.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String ip = ServletUtil.getClientIP(request, null   );
        log.info("登录地址IP是============> {}", ip);
        AccessLogInfo accessLogInfo = new AccessLogInfo();
        accessLogInfo.setId(UUID.randomUUID().toString());
        accessLogInfo.setAccessIp(ip);
        accessLogInfo.setAccessTime(new Date());
        service.select(accessLogInfo);
        return true;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

}
