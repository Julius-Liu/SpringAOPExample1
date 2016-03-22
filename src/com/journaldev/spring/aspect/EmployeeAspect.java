package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
/*
 * 前置通知
 */
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.journaldev.spring.service.*.get*())")
	/*
	 * execution(): 表示拦截方法，括号中可定义需要匹配的规则。
	 * 第一个 * ： 表示方法的返回值是任意的。
	 * 第二个 * ： 表示 com.journaldev.spring.service 下面的任意一个类
	 * 第三个 * ： 表示匹配类中所有以 get 开头的方法。
	 * () : 表示这个 get* 方法必须是没有参数的。
	 */
	public void getAllAdvice() {
		System.out.println("Service method getter called");
	}
}
