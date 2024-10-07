package com.programspractice;

public class ReverseCharacters {

	public static void main(String[] args) {
		String str="Automation";
		
//		int len=str.length();
		String rev="";
//***************1st Method***************************
//		for (int i =len-1; i>=0; i--) {
//			
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
//***************2nd Method***************************		
//		char[] arrayOfChars=str.toCharArray();
//		
//		int length = arrayOfChars.length;
//		
//		for (int i = arrayOfChars.length-1; i >=0 ; i--) {
//			rev=rev+arrayOfChars[i];
//		}
//		System.out.println(rev);
//***************3rd Method***************************	
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
