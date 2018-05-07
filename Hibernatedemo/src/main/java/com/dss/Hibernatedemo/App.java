package com.dss.Hibernatedemo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.dss.Hibernatedemo.entity.employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       employee e=new employee(1, "irfan");
     Session s = new Configuration().configure().buildSessionFactory().openSession();
    	s.beginTransaction();
    	s.save(e);
    	System.out.println("data saved");
    	s.getTransaction().commit();
    	
    }
}
