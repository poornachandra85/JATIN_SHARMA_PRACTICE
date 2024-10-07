package com.api.pojo;

import com.google.gson.Gson;

public class Runner2 {

	public static void main(String[] args) {
		Data myData=new Data("asadasfaskadascaslfa");
		
		LoginResponsePOJO loginResponse=new LoginResponsePOJO("Success", myData);
		
		Gson gson=new Gson();
		System.out.println(gson.toJson(loginResponse));
		
		System.out.println(gson.fromJson(gson.toJson(loginResponse), LoginResponsePOJO.class));
	}

}
