package com.wsleli.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/25 15:01
 */
@Component
@Aspect
public class ProjectAdvice {
    // 配置业务层的所有方法
    @Pointcut("execution(* com.wsleli.service.*Service.*(..))")
    private void servicePt() {
    }

    //@Around("ProjectAdvice.servicePt()") 可以简写为下面的方式
    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        // 获取执行签名信息
        Signature signature = pjp.getSignature();
        // 通过签名获取执行操作名称(接口名)
        String className = signature.getDeclaringTypeName();
        // 通过签名获取执行操作名称(方法名)
        String methodName = signature.getName();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行：" + className + "." + methodName + "---->" + (end - start) + "ms");
    }
}