package com.api.pojo;

public class Data {
	
	private String token;
	
	

	public Data(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "DataPOJO [token=" + token + "]";
	}

	
	
	
	
}
