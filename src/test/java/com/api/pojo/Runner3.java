package com.api.pojo;

import static com.utility.TestUtility.*;


public class Runner3 {

	public static void main(String[] args) {
		
		CreateJobPOJO createJobPOJO=getCreateJobPOJO();
		
		
		System.out.println(getJSONObject(createJobPOJO));
		
		System.out.println(getPOJOObject(getJSONObject(createJobPOJO), CreateJobPOJO.class));
	}

	

}
