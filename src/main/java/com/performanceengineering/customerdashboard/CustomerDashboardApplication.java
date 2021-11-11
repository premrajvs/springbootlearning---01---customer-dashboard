package com.performanceengineering.customerdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomerDashboardApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(CustomerDashboardApplication.class, args);

		System.out.println("welcome to the first step in learning springboot");

		funfact1 funobject = new funfact1();
		funobject.showfacts();
		funfact1 funobject1 = new funfact1();
		funobject1.showfacts();
		funfact1 funobject2 = new funfact1();
		funobject2.showfacts();
		/*
		 * funfact1 funobject = cac.getBean(funfact1.class); funobject.showfacts();
		 * funfact1 funobject1 = cac.getBean(funfact1.class); funobject1.showfacts();
		 * funfact1 funobject2 = cac.getBean(funfact1.class); funobject2.showfacts();
		 */
	}

}
