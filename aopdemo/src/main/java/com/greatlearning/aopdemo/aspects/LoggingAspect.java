package com.greatlearning.aopdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private final Logger log=LoggerFactory.getLogger(this.getClass());

	@Pointcut("within(@org.springframework.stereotype.Repository *)"
			+ " || within(@org.springframework.stereotype.Service *)"
			+ " || within(@org.springframework.web.bind.annotation.RestController *)"
			)
	public void springBeanPointcut() {
		
	}
	
	@Pointcut("within(com.greatlearning.aopdemo..*)"
			+ " || within(com.greatlearning.aopdemo.service..*)"
			+ " || within(com.greatlearning.aopdemo.controller..*)"
			)
	public void applicationPackagesPointCut() {
		
	}
	
	@AfterThrowing(pointcut = "springBeanPointcut() && applicationPackagesPointCut()"
			,throwing = "e")
	public void logAfterThrowing(JoinPoint joinPoint,Throwable e) {
		log.error("Exception in {},{}() with cause= {} ",joinPoint.getSignature().getDeclaringType()
				,joinPoint.getSignature().getName(), e.getMessage());
	}
	
	@Around("springBeanPointcut() && applicationPackagesPointCut()")
	public Object logEntryExit(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("Hey entry/exit of method");
		
		return joinPoint.proceed();
	}
}
			
			
