package com.programspractice;

public class Sorting {

	public static void main(String[] args) {
		int a=1;
		int b=5;
		int c=2;
		
		if (a>b) {
			a=a+b;
			b=a-b;
			a=a-b;
		} else if(b>c) {
			b=b+c;
			c=b-c;
			b=b-c;
		}
System.out.println(a+","+b+","+c);
	}

}
