package com.dss.Hibernatedemo;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;









/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		 
      
		  Session session = new Configuration().configure().buildSessionFactory().openSession();
		  session.beginTransaction();
        
       /* Meeting meeting1 = new Meeting("Quaterly Sales meeting");
        Meeting meeting2 = new Meeting("Weekly Status meeting");
        Meeting meeting3 = new Meeting("appresial Status meeting");
        
        Employee employee1 = new Employee("Sergey", "Brin");
        Employee employee2 = new Employee("Larry", "Page");

        employee1.getMeetings().add(meeting1);
        employee1.getMeetings().add(meeting2);
        employee2.getMeetings().add(meeting3);
        
        meeting1.getEmployees().add(employee1);
        meeting1.getEmployees().add(employee2);
        
        session.save(employee1);
        session.save(employee2);*/
        
        
      IFCE_CODE code=new IFCE_CODE("lakshmi", "LK1234", 89898, "latur", "mahadev nagar", 992286573, "latur", "Latur", "MAH");
        
        session.save(code);
    
        
        
        
        
        
        
        
        
        
       // session.save(meeting1);
        
        session.getTransaction().commit();
        IFCE_CODE dd = session.get(IFCE_CODE.class, "HDFC0CYACBP");
        System.out.println(dd);
          
        session.close();
    }

    	
   
   
    	
    }

