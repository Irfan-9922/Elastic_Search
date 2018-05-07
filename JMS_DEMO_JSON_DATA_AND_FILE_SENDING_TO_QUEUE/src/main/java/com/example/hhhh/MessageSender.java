package com.example.hhhh;

import java.io.File;

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


public class MessageSender {
	
	//URL of the JMS server. DEFAULT_BROKER_URL will just mean that JMS server is on localhost
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	
	// default broker URL is : tcp://localhost:61616"
	private static String subject = "QUEUE1"; // Queue Name.You can create any/many queue names as per your requirement.	
	
	public static void main(String[] args) throws JMSException, JsonProcessingException {		
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
		demo obj23 = new demo(2133,"rambo1");
	
		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(obj23);
		
		// We will send a small text message saying 'Hello World!!!' 
		TextMessage message = session
				.createTextMessage(jsonInString);
		producer.send(message);
		System.out.println("JCG printing@@ '" + message.getText() + "'");
	
		
		/**==========================================================================*/
		
		
		/**
		 * sending object to Queu
		 * 
		 */
		
		/**==========================================================================*/
		 
		/*demo d=new demo(123,"nisar");
		  ObjectMessage mm = session.createObjectMessage(d);
		  System.out.println(mm);
		
		// Here we are sending our message!
	producer.send(mm);
	System.out.println("JCG printing@@ '" + mm.getObject() + "'");
	*/
	
	/**==========================================================================*/
		
		connection.close();
	}
}