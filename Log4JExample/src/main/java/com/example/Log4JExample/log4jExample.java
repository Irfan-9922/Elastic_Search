package com.example.Log4JExample;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class log4jExample{

   /* Get actual class name to be printed on */
	final static Logger logger = Logger.getLogger(log4jExample.class);
   
   public static void main(String[] args)throws IOException,SQLException{
	   logger.debug("Hello this is a debug message");
	   logger.info("Hello this is an info message");
   }
}