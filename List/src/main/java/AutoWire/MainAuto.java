package AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAuto {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("AutoWireFile.xml");
		Employee e = (Employee) c.getBean("emp");
		System.out.println(e);
	}

}
