package com.programspractice;

public class NoOfOccureces {

	public static void main(String[] args) {
		String str="abcdac";
		Character ch=null;
		
		int counter=0;
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					ch=str.charAt(i);
					counter++;
				} 
				
			}
			
		}
		System.out.println("Character "+ch+" has been repeated "+counter);
	}

}
