package com.example.hhhh;

import java.io.File;
import java.io.IOException;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageReceiver {

	// URL of the JMS server
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	// default broker URL is : tcp://localhost:61616"

	// Name of the queue we will receive messages from
	private static String subject = "QUEUE03";

	public static void main(String[] args) throws JMSException, JsonGenerationException, JsonMappingException, IOException {
		// Getting JMS connection from the server
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();

		// Creating session for seding messages
		Session session = connection.createSession(false,
				Session.AUTO_ACKNOWLEDGE);

		// Getting the queue 'JCG_QUEUE'
		Destination destination = session.createQueue(subject);

		// MessageConsumer is used for receiving (consuming) messages
		MessageConsumer consumer = session.createConsumer(destination);

		// Here we receive the message.
		ObjectMessage message = (ObjectMessage) consumer.receive();

		// We will be using TestMessage in our example. MessageProducer sent us a TextMessage
		// so we must cast to it to get access to its .getText() method.
		if (message instanceof ObjectMessage) {
			ObjectMessage textMessage = (ObjectMessage) message;
			System.out.println("Received message '" + textMessage.getObject() + "'"+destination.toString());
			
			//store data into file
			ObjectMapper mapper=new ObjectMapper();
			
			mapper.writeValue(new File("D:\\recived.json"), textMessage.getObject());
		}
		connection.close();
	}
}