package org.demo;

import org.demo.service.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp 
{
	  public static void main(String[] args) {
	      ApplicationContext ctx = SpringApplication.run(SpringBootApp.class, args);

	      EmpService bean = ctx.getBean(EmpService.class);
	      bean.sayHello();
	   
	      System.out.println( bean.getallonsite());
	   }
}