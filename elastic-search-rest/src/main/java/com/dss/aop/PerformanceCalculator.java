package com.dss.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceCalculator {

	  @Around("execution(* com.dss.service.CurdServiceImpl.*(..))")
	   public Object performanceCalculator(ProceedingJoinPoint joinpoint) throws Throwable {
		       int start=(int)System.currentTimeMillis();
		       Object ret=joinpoint.proceed();
		       int end=(int)System.currentTimeMillis();
		       System.out.println(joinpoint.getSignature().getName()+"====="+(end-start)+"millis seconds");
		       return ret;
	   }
}
