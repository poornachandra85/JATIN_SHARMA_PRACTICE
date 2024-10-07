package com.api.tests;



import static com.utility.TestUtility.getTokenFor;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class UserAPIRequest {
	
	static {
		baseURI="http://139.59.91.96:9000";
	}
	

	@Test(description = "Test is to user api requests",groups = {"smoke","sanity","e2e"} )
	public  void userAPItest() {
		
//		RestAssured.baseURI="http://139.59.91.96:9000";
		
		Header header=new Header("Authorization", getTokenFor("fd"));	
		RequestSpecification request=given();
		request.header(header);
		request.get("/v1/userdetails").prettyPrint();


	}

}
