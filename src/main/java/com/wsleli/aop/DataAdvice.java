package com.wsleli.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description: 功能描述
 * @Version: 1.0
 * @Author: Wsleli Wiliams
 * @Date: 2024/04/09 9:05
 */
@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution( boolean com.wsleli.service.*Service.*(*, *))")
    private void servicePt() {
    }

    @Around("DataAdvice.servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 判断参数是不是字符串
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        Object ret = pjp.proceed(args);
        return ret;
    }
}
