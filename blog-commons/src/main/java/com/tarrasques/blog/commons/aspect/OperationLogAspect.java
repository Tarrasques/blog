package com.tarrasques.blog.commons.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OperationLogAspect {

    private Logger log = LoggerFactory.getLogger(OperationLogAspect.class);

    @Pointcut("@annotation(com.tarrasques.blog.commons.aspect.OperationLog)")
    public void doAscept() {
    }

    @Around("doAscept()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("进入切面");
        return joinPoint.proceed();
    }

    @After("doAscept()")
    public void after(JoinPoint joinPoint) {
        log.info("方法执行之后");
//        return null;
    }

    @Before("doAscept()")
    public void before(JoinPoint joinPoint) {
        log.info("方法执行之前");
//        return null;
    }

}
