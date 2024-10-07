package com.api.pojo;

import com.google.gson.Gson;

public class Runner {

	public static void main(String[] args) {
		
		LoginRequestPOJO phoenixLoginCredentials=new LoginRequestPOJO("iamfd", "password");
		System.out.println(phoenixLoginCredentials);
		
		Gson gson=new Gson();
		System.out.println(gson.toJson(phoenixLoginCredentials));
		
		
		

	}

}
