package com.example.TodoAPISpring.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect {
/*

advice : logic to be executed, when to execute (before, after, around)
*/
    @Around("@annotation(TimeMonitor)")
    public void logTime(ProceedingJoinPoint joinPoint){
        long start = System.currentTimeMillis();
        try{
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        long totalExecutionTime = end - start;
        System.out.println(totalExecutionTime);
    }



}
