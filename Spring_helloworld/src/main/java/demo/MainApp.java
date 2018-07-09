package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		      ApplicationContext context = new FileSystemXmlApplicationContext ("/src/main/java/demo.xml");
		      
		      HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
		      System.out.println(obj.printHello());
		   }
	}
