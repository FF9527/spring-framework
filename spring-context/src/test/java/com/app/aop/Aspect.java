package com.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author:wuqi
 * @date:2020/3/2
 * @description:com.app.aop
 * @version:1.0
 */
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {
    @Pointcut("execution(* xx())")
    public void pointCut(){

    }
    @Pointcut("this(Xxable)")
    public void pointCutThis(){

    }
    @Pointcut("target(Xxable)")
    public void pointCutTarget(){

    }
    @Pointcut("within(com.app.aop.*)")
    public void pointCutWithin(){

    }
	@Around("pointCut()")
    public void aroundAdvice(ProceedingJoinPoint point) throws Throwable {
		System.out.println("around before advice");
		point.proceed();
		System.out.println("around after advice");
	}

    @Before("pointCut()")
    public void beforeAdvice(){
        System.out.println("before advice");
    }

    @After("pointCut()")
    public void afterAdvice(){
        System.out.println("after advice");
    }

	@AfterReturning("pointCut()")
	public void afterReturningAdvice(){
		System.out.println("AfterReturning advice");
	}

	@AfterThrowing("pointCut()")
	public void afterThrowingAdvice(){
		System.out.println("AfterThrowing advice");
	}


}
