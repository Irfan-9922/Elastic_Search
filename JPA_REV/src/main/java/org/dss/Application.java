package org.dss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application  implements CommandLineRunner{
	@Autowired
	StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student(1,"irfan","pune");
		repo.save(s);
	
		System.out.println(repo.findOne(1));
		
	}

}
