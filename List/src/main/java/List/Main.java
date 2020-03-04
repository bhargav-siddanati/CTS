package List;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("listtype.xml");
		Student s = (Student) context.getBean("std");
		
		System.out.println(s.getStdName());
		List<College_pojo> l = s.getPojo();
	
		for(College_pojo ll: l){
			
			System.out.println(ll.getName() + "   " + ll.getTel());
		}
		
	}
		
}
