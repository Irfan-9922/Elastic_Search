package com;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.service.EmpServcie;

@SpringBootApplication
public class SpringBootApp 
{
	  public static void main(String[] args) {
	      ApplicationContext ctx = SpringApplication.run(SpringBootApp.class, args);

	      EmpServcie bean = ctx.getBean(EmpServcie.class);
	     // bean.sayHello();
	   
	      System.out.println( bean.allemp());
	   }
}