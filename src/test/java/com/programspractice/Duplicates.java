package com.programspractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {
	
	public static void main(String[] args) {
		String str="MY NAME IS KARTHIK";
		char[] ch=str.toCharArray();
		
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for (char c : ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
				
			}
			
		}
		
		Set<Entry<Character, Integer>> charEntrySet = charMap.entrySet();
		
		for (Entry<Character, Integer> entry : charEntrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"  is repeated  "+entry.getValue()+" number of times");
			}else {
				System.out.println(entry.getKey()+"  is repeated  "+entry.getValue()+" number of times");
			}
			
		}
	}

}
