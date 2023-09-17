package com.greatlearning.aopdemo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;



@Aspect
@Component
public class EmployeeServiceAspect {
	
//	@Before(value = "execution(* com.greatlearning.aopdemo.service.EmployeeService.*(..)) and args(name,empId)")
//	public void beforeAdvice(JoinPoint joinPoint,String name,String empId) {
//		
//		if(StringUtils.isEmpty(name)) {
//			System.out.println("Name cannot be empty");
//		}
//		System.out.println("Before Method: "+joinPoint.getSignature());
//		
//		System.out.println("Creating Emp with name: "+name+", id: "+empId);
//		
//	}
//	
//	@After(value = "execution(* com.greatlearning.aopdemo.service.EmployeeService.*(..)) and args(name,empId)")
//	public void afterAdvice(JoinPoint joinPoint,String name,String empId) {
//		System.out.println("After Method: "+joinPoint.getSignature());
//		
//		System.out.println("Success created Emp with name: "+name+", id: "+empId);
//		
//	}

}
