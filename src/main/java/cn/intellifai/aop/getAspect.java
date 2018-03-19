package cn.intellifai.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by zhushuangfei on 2018/3/15
 */

@Aspect
@Component
public class getAspect {
    private static Logger logger = LoggerFactory.getLogger(addAspect.class);

    @Around("execution(* cn.intellifai.*.Impl.IntellifaiAiReportServiceImpl.get*(..))")
    public Object getAiResultAOP(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取service参数
        Object[] objs = joinPoint.getArgs();

        Date now = new Date();

        //获取service返回值
        Object rvt = joinPoint.proceed(objs);

        return rvt;
    }
}
