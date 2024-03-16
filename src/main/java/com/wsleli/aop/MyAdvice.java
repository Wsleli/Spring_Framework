package com.wsleli.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: Wsleli Wiliams
 * @Description: 功能描述
 * @Date: 2024/03/12 11:10
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.wsleli.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.wsleli.dao.BookDao.select())")
    private void pt2() {
    }

    //    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

    @After("pt2()[")
    public void after() {
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice ...");
    }

//    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
