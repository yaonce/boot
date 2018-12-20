package com.baizhi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class TestAspect {
    @Pointcut(value = "execution(* com.baizhi.service..*.*(..))")
    public void pointCut() {
    }
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("----------around start---------");
        System.out.println("=======");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("==========around end =============");
        return proceed;
    }
//    @Before(value = "pointCut()")
//    public void before(JoinPoint joinPoint){
//        System.out.println(joinPoint.getArgs());
//        System.out.println("lkjlkjlkjkljkljkljlkjkljlkj");

//    }

}
