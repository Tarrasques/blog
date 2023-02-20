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
    public void OperationLog(){}

    @Around("OperationLog()")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("around");
        return null;
    }

    @After("OperationLog()")
    public Object after(JoinPoint joinPoint) {
        System.out.println("after");
        return null;
    }

    @Before("OperationLog()")
    public Object before(JoinPoint joinPoint) {
        System.out.println("before");
        return null;
    }

}
