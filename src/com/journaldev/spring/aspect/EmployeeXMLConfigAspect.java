package com.journaldev.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
/*
 * Spring AOP 通过 XML 配置来实现
 */
public class EmployeeXMLConfigAspect {

	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("EmployeeXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("EmployeeXMLConfigAspect:: After invoking getName() method. Return value=" + value);
		return value;
	}
}
