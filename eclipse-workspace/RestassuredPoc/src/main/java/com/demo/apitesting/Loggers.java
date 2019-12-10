package com.demo.apitesting;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
   
public class Loggers {  
	
  public static Logger logger = LogManager.getLogger(Loggers.class);  
  
 public  Loggers() {  
  BasicConfigurator.configure();  
	 //logger.info("we are in logger info mode");
  
 }  
   
} 