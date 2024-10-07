package com.programspractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=12345;
		int rev=0;
		
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		}
System.out.println(rev);
		
		int num=123456789;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
		
		StringBuilder sb1=new StringBuilder(String.valueOf(num));
		System.out.println(sb1.reverse());
		
	}

}
