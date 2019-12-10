package com.demo.ApiTestScripts;

import com.demo.apitesting.ApachePoiData;
import com.demo.apitesting.Loggers;
import com.demo.apitesting.PropertyClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class BaseClass extends Loggers
{
	static ExtentTest test;
	
	static ExtentReports report;

	@BeforeClass
	public void test() {
		
		RestAssured.baseURI = PropertyClass.data_Driven_Method("RestAssured.baseURI");
		
		logger.info("**********************************");
		logger.info("starting adding the elements in a extended reports");

		 
		 report = new ExtentReports(System.getProperty("C:\\Users\\gomathi.karnan\\eclipse-workspace\\RestassuredPoc\\test-output")+"\\ExtentReportResults.html");
		 
		 test = report.startTest("BaseClass");

		 

}
	
	
	@AfterClass

	public static void endTest()	
	{

	report.endTest(test);

	report.flush();
	
	}
	


	
	

	
	
}
