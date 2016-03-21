package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		String getNameRes = employeeService.getEmployee().getName();
		System.out.println(getNameRes);
		employeeService.getEmployee().setName("Pankaj");
		employeeService.getEmployee().throwException();
		ctx.close();
	}
}
