package com.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		College st1=context.getBean("st",College.class);
		
		System.out.println(st1.getSt());
		//System.out.println(st1.getName());


	}

}
