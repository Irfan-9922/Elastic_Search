package com.example.hhhh;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MessageSender2 {
	
	//URL of the JMS server. DEFAULT_BROKER_URL will just mean that JMS server is on localhost
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	
	// default broker URL is : tcp://localhost:61616"
	
	private static String subject = "QUEUE03"; // Queue Name.You can create any/many queue names as per your requirement.	
	
	public static void main(String[] args) throws JMSException, IOException {		
		// Getting JMS connection from the server and starting it
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();
		
		//Creating a non transactional session to send/receive JMS message.
		Session session = connection.createSession(false,
				Session.AUTO_ACKNOWLEDGE);	
		
		//Destination represents here our queue 'JCG_QUEUE' on the JMS server. 
		//The queue will be created automatically on the server.
		Destination destination = session.createQueue(subject);	
		
		// MessageProducer is used for sending messages to the queue.
		MessageProducer producer = session.createProducer(destination);
		
		/**
		 * sending Json to Queue
		 * 
		 */
		
		
	/**==========================================================================*/
		
		ObjectMapper mapper = new ObjectMapper();
	
		
		List<?> dk=mapper.readValue(new File("D:\\writer.json"), List.class);
		
		
		  ObjectMessage mm = session.createObjectMessage((Serializable) dk);
		
		// Here we are sending our message!
	producer.send(mm);
	
	/**==========================================================================*/
		
		connection.close();
	}
}