package com.bean.SpringAnnotationExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean(name="mybean")
	public HelloWorld getHelloworld(){
		return new HelloWorld();
	}

}
