package com.api.tests;



import static com.utility.TestUtility.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

import com.dataproviders.LoginDataProvider;

import io.restassured.http.Header;
import io.restassured.module.jsv.JsonSchemaValidator;

public class LoginAPIRequests {
	
	static {
		baseURI="http://139.59.91.96:9000";
	}
	
	private File jsonSchemaFile=new File(System.getProperty("user.dir")+"//src//test//resources//responseSchemas//loginResponseSchema.json");

	@Test(description = "test is to test login API requests", groups = {"smoke","sanity","e2e"},
			dataProviderClass = com.dataproviders.LoginDataProvider.class,
			dataProvider = "LoginExcelData")
	public void loginTest(String username,String password) {
		
		
		Header myHeader=new Header("Content-Type","application/json");
		
//		RequestSpecification request=given();
//		request.header(myHeader);
//		request.body(ConvertPOJOToJSON(getLoginPOJO("iamfd","password")));
//		Response response=request.post("/v1/login");
		
		
//		Response response=given()
//				.when()
//					.header(myHeader)
//				.and()
//					.body(ConvertPOJOToJSON(getLoginPOJO("iamfd","password")))
//				.and()
//					.log().all()
//					.post("/v1/login");
//		System.out.println("Response Body "+response.asPrettyString());
//		System.out.println("Response Status Code "+response.statusCode());
//		System.out.println("Response Time "+response.time());
				
		
		
String token=		given()
				.when()
					.header(myHeader)
				.and()
					.body(getJSONObject(getLoginPOJO(username,password)))
				.and()
					.log().all()
					.post("/v1/login")
				.then()
				   .log().all()
				   .assertThat()
				   .statusCode(200)
				.and()
					.time(lessThan(1500L))
				.and()
					.body(JsonSchemaValidator.matchesJsonSchema(jsonSchemaFile))
				.and()
					.body("message", equalToIgnoringCase("Success"))
				.and()
					.extract().jsonPath().getString("data.token");

System.out.println(token);
	}
}
