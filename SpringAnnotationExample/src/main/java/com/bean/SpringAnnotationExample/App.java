package com.bean.SpringAnnotationExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw=ap.getBean("mybean",HelloWorld.class);
        
        hw.sayHello();
        
        
        
        
        
        
    }
}
