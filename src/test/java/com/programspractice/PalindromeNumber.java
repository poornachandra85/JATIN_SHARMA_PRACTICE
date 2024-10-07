package com.programspractice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number=1234321;
		int rem=0;
		int com=number;
		while(number!=0) {
			rem=rem*10+number%10;
			
			number=number/10;
		}

		if(com==rem) {
			System.out.println(com+" entered is a palindrome");
		}else {
			System.out.println(com+" entered is not a palindrome");
		}
	}

}
