package Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMap {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("Maps.xml");
		Question_class qc = (Question_class) app.getBean("qus");
		qc.display();
		
	}

}
