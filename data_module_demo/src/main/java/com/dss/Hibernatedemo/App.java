package com.dss.Hibernatedemo;


import java.util.ArrayList;
import java.util.List;

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
		 
        MasterInstance master=new MasterInstance();
        
        MasterObject masterobject=new MasterObject();
        masterobject.setMasterObjectId(67L);
        masterobject.setMasterInstances(master);
        
        MasterObject masterobject1=new MasterObject();
        masterobject1.setMasterObjectId(65l);
        masterobject1.setMasterInstances(master);
        
        master.setID(34L);
        master.setMS_RULE_V_ID(35L);
        master.setObject_ID(54L);
        master.getItems().add(masterobject);
        master.getItems().add(masterobject1);
        session.save(master);
        
       MasterInstance dd = session.get(MasterInstance.class, 34L);
       System.out.println(dd);
        
       
		session.close();

        
	}

    	
   
   
    	
    }

