package com.demo.apitesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {

	public static String data_Driven_Method(String key) {


      FileInputStream output = null;
      Properties prop = null;
 
	try {
		output = new FileInputStream("C:\\Users\\gomathi.karnan\\eclipse-workspace\\RestassuredPoc\\resources\\datadriven.properties");
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	prop = new Properties();
    
		try {
			prop.load(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
 return prop.getProperty(key);

          
        
             

          
	}
    
}
