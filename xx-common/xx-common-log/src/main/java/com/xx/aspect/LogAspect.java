package com.xx.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Log Aspect
 *
 * @author lzn
 */
@Aspect
public class LogAspect {

    @Pointcut("@annotation(myLog)")
    public void point(MyLog myLog) {
    }

    @Around("point(myLog)")
    public Object around(ProceedingJoinPoint pjp,
                         MyLog myLog) throws Throwable {
        System.out.printf("Before %s%n", myLog.title());
        System.out.printf("Param is [ %s ]%n", pjp.getArgs());
        Object proceed = pjp.proceed();
        System.out.printf("Result is [ %s ]%n", proceed.toString());
        System.out.printf("After %s%n", myLog.title());
        return proceed;
    }
}
