package com.mnaufalazwar.springframeworkbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(scanBasePackages={"com.mnaufalazwar.springframeworkbasic"})
public class SpringFrameworkBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkBasicApplication.class, args);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		try {
			context.registerShutdownHook();
			Shape shape = (Shape) context.getBean("circle");
			shape.draw();
			
//			System.out.println(context.getMessage("greeting", null, "default greeting", null));
		} finally {
			context.close();
		}
		
//		try {
//			context.registerShutdownHook();
//			Circle triangle = (Circle) context.getBean("circle");
//			triangle.draw();
//		} finally {
//			context.close();
//		}
		
//		try {
//			context.registerShutdownHook();
//			Triangle triangle = (Triangle) context.getBean("triangle");
//			triangle.draw();
//		} finally {
//			context.close();
//		}
		
//		context.registerShutdownHook();
//		Triangle triangle = (Triangle) context.getBean("triangle");
//		triangle.draw();
		
//		triangle.getPointA().setX(99);
//		triangle.getPointA().setY(99);
//		
//		Triangle triangle2 = (Triangle) context.getBean("triangle-alias");
//		triangle2.draw();
		
//		TriangleList triangleList = (TriangleList) context.getBean("triangleList");
//		triangleList.draw();
//		
//		TriangleBeanAutowire triangleBeanAutowire = (TriangleBeanAutowire) context.getBean("triangleBeanAutowire");
//		triangleBeanAutowire.draw();
		
	}

}
