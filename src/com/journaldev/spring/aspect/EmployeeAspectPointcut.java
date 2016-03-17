package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * Pointcut 的方法 和 Pointcut 的重用
 */
@Aspect
public class EmployeeAspectPointcut {
	
	@Before("getNamePointcut()")	
	public void loggingAdvice(){
		System.out.println("loggingAdvice on getName()");
	}
	
	@Before("getNamePointcut()")	
	public void secondAdvice(){
		System.out.println("secondAdvice on getName()");
	}
	
	/*
	 * 这里要先配置好一个函数名称
	 */	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {
		System.out.println("This is getNamePointcut method");
	}
	
	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Before executing service method");
	}
	
	/*
	 * 这里要先配置好一个函数名称
	 * Pointcut to execute on all the methods of classes in a package
	 */
	@Pointcut("within(com.journaldev.spring.service.*)")
	public void allMethodsPointcut() {
		System.out.println("This is allMethodsPointcut method");
	}
	
}
