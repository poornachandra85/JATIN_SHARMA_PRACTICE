package com.api.tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.utility.TestUtility.*;

import io.restassured.http.Header;

public class CreateJOBAPITest {
	
	private Header h1;
	private Header h2;
	private String JobNumber;
	
	static {
		baseURI="http://139.59.91.96:9000";
	}
	
	@BeforeMethod(description = "Setup method is to initialize the headers")
	public void setup() {
		h1=new Header("Authorization",getTokenFor("fd"));
		h2=new Header("Content-Type","application/json");
		
	}

	@SuppressWarnings("deprecation")
	@Test(description = "Test is to create JOB api requests and get JOB Number",groups = {"smoke","sanity","e2e"} )
	public void CreateJOBtest() {
		
	JobNumber=	given()
			.header(h1)
		.and()
			.header(h2)
		.and()
			.body(getJSONObject(getCreateJobPOJO()))
			.log().all()
		.when()
			.post("/v1/job/create")
		.then()
			.log().all()
			.assertThat()
			.statusCode(200)
		.and()
			.body("message", equalToIgnoringWhiteSpace("Job created successfully."))
		.and()
			.extract().jsonPath().getString("data.job_number");
	
	System.out.println("Job Number is :=="+JobNumber);
		
	}

}
