package com.programspractice;

import java.util.ArrayList;
import java.util.List;

public class Pooexception {

	public static void main(String[] args) {
//		try {
//			int a=10/0;
//		}catch (ArithmeticException e) {
//			System.err.println("First block "+e.getLocalizedMessage());
//			try {
//				int a=10/1;
//			}catch (Exception e1) {
//				System.err.println("Second block "+e1.getLocalizedMessage());
//			}finally {
//				System.out.println("Second block "+"Executed successfully");
//			}
//		}
//		finally {
//			System.out.println("First block "+"Executed successfully");
//		}
		
//		String str=null;
//		str.length();
		
		List<String> strList=new ArrayList<String>();
		strList.add("123");
		strList.add("456");
		
		for (String string : strList) {
			System.out.println(string);
			
		}
		
		
	
	}

}
