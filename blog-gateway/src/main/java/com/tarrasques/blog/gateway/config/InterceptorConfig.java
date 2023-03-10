package com.tarrasques.blog.gateway.config;

import cn.hutool.extra.servlet.ServletUtil;
import com.tarrasques.blog.commons.entity.AccessLogInfo;
import com.tarrasques.blog.commons.utils.UUIDUtil;
import com.tarrasques.blog.gateway.service.impl.AccessLogInfoServiceImpl;
import com.tarrasques.blog.gateway.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class InterceptorConfig implements HandlerInterceptor, Ordered {

    @Resource
    private AccessLogInfoServiceImpl service;
    @Resource
    private RedisUtil redisUtil;

    private Logger log = LoggerFactory.getLogger(InterceptorConfig.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String ip = ServletUtil.getClientIP(request, null);
        String path = request.getServletPath();
        //确认是否登录
        String token = response.getHeader("token");
        
        log.info("登录地址IP是============> {}", ip);
        AccessLogInfo accessLogInfo = new AccessLogInfo();
        accessLogInfo.setId(UUIDUtil.getUUID());
        accessLogInfo.setAccessIp(ip);
        accessLogInfo.setAccessName("访客");
        accessLogInfo.setAccessPath(path);
        accessLogInfo.setAccessTime(new Date());
        redisUtil.set("ip:", ip);
        service.insertAccessLog(accessLogInfo);
        return true;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }

}
