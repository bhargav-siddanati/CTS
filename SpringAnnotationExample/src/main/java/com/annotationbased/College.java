package com.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
	@Autowired
	@Qualifier("stu2")
	Student st;

	public College(Student st) {
		super();
		this.st = st;
	}

	public Student getSt() {
		return st;
	}
	
}
