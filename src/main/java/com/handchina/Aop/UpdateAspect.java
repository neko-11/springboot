package com.handchina.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhushuangfei on 2018/7/19
 */

@Aspect
@Component
public class UpdateAspect {
    private static Logger logger = LoggerFactory.getLogger(UpdateAspect.class);

    @Around("execution(* com.handchina.*.Impl.*ServiceImpl.update*(..))")
    public Object updateMethodAOP(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取service参数
        Object[] objs = joinPoint.getArgs();

        Date now = new Date();

        //获取service返回值
        Object rvt = joinPoint.proceed(objs);

        return rvt;
    }
}
