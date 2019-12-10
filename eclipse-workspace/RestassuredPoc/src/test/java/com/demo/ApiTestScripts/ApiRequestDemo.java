package com.demo.ApiTestScripts;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.testng.annotations.Test;

import com.demo.apitesting.ApachePoiData;
import com.demo.apitesting.PropertyClass;
import com.gargoylesoftware.htmlunit.javascript.host.fetch.Headers;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class ApiRequestDemo extends BaseClass {
	
	
	@Test(enabled=true)
	public static void getRequestDemo() {
		// TODO Auto-generated method stub
//"https://reqres.in/";
		logger.info("**********************************");
        logger.info("executing the getRequestDemo() ");


try
{
 Response response= RestAssured.given().
     params("page",PropertyClass.data_Driven_Method("page")).
     when().get(PropertyClass.data_Driven_Method("getrequest"));
    	String responsebody=response.getBody().asString();
    System.out.println(responsebody);
    System.out.println(response.getStatusCode());
    assertEquals(responsebody.contains(PropertyClass.data_Driven_Method("getverificationkey")), true);
	 logger.info("executed the getRequestDemo() ");
		logger.info("**********************************");

		test.log(LogStatus.PASS, "getRequest passed");
}
catch(Exception e)
{
		test.log(LogStatus.FAIL, "Test Failed");
}
	}



	@Test
	public static void postRequestDemo() {
		// TODO Auto-generated method stub
		//"https://reqres.in/";
		logger.info("**********************************");

		logger.info("executing the postRequestDemo() ");
try
{
	
		 RequestSpecification request= RestAssured.given().body(ApachePoiData.fetch_data_from_excelfile("Sheet1", 1, 5));
		 Response r=request.post(ApachePoiData.fetch_data_from_excelfile("Sheet1", 1, 3));
		 logger.info("executed the postRequestDemo() ");

		assertEquals(r.getStatusCode(), 201);
		io.restassured.http.Headers allHeaders = r.headers();
		
		for(Header value:allHeaders)
		{
			System.out.println(value.getName()+" "+value.getValue());
		}
		String actualbody=r.getBody().asString();
		 
		 //assertEquals(actualbody,ApachePoiData.fetch_data_from_excelfile("Sheet1", 1, 8));
			logger.info("**********************************");

			
test.log(LogStatus.PASS, "postRequest passed");
}
catch(Exception e)
{
test.log(LogStatus.FAIL, "Test Failed");
}
	}
	@Test
	public static void putRequestDemo() {
		// TODO Auto-generated method stub
		//"https://reqres.in/";
		logger.info("**********************************");

		logger.info("executing the putRequestDemo() ");
try {
		 RequestSpecification request= RestAssured.given()
				 .body(ApachePoiData.fetch_data_from_excelfile("Sheet1", 2, 5));
		 String req=ApachePoiData.fetch_data_from_excelfile("Sheet1", 2, 3);
		 System.out.print(req);
		 Response r=request.put(req);
		 logger.info("executed the putRequestDemo() ");

		assertEquals(r.getStatusCode(), 200);
		String ContentType = r.header("Content-Type");
		System.out.println(" the content type value is" + ContentType );
		String Cookie = r.cookie("Set-Cookie");
		System.out.println(" the Cookie value is" + Cookie );



		 String actualbody=r.getBody().asString();
		// request.time(lessThan(10L));
		 
		 
		 //assertEquals(actualbody,ApachePoiData.fetch_data_from_excelfile("Sheet1", 2, 8));
			logger.info("**********************************");
			test.log(LogStatus.PASS, "putRequest passed");
}
catch(Exception e)
{
			test.log(LogStatus.FAIL, "Test Failed");
}
			}
	@Test
	public static void deleteRequestDemo() {
		// TODO Auto-generated method stub
		//"https://reqres.in/";
		logger.info("**********************************");

		logger.info("executing the deleteRequestDemo() ");
try 

{
	RequestSpecification request= RestAssured.given();

		 Response r=request.delete(ApachePoiData.fetch_data_from_excelfile("Sheet1", 3, 5));
		 logger.info("executed the deleteRequestDemo() ");
		 System.out.println(r.getStatusCode());
//		assertEquals(r.getStatusCode(), 404);
		String ContentType = r.header("Content-Type");
		System.out.println(" the content type value is" + ContentType );
		String Cookie = r.cookie("Set-Cookie");
		System.out.println(" the Cookie value is" + Cookie );



		 String actualbody=r.getBody().asString();
           //r.then().time(lessThan(100L));
		// request.time(lessThan(10L));
		 
		 
		// assertEquals(actualbody,ApachePoiData.fetch_data_from_excelfile("Sheet1", 2, 8));
			logger.info("**********************************");
			test.log(LogStatus.PASS, "deleteRequest passed");
}
catch(Exception e)
{
			test.log(LogStatus.FAIL, "Test Failed");
}
			}
	
}