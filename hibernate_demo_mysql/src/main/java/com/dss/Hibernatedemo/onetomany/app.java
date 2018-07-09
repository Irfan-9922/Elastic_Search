package com.dss.Hibernatedemo.onetomany;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.dss.Hibernatedemo.Employee;
import com.dss.Hibernatedemo.Meeting;

public class app {
	public static void main(String[] args) {
		 
	      
		  Session session = new Configuration().configure().buildSessionFactory().openSession();
		  session.beginTransaction();
		 
      
      session.getTransaction().commit();
      session.close();
  }
}
