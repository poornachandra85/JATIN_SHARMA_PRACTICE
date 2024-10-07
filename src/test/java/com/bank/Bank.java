package com.bank;

public abstract class Bank {
	
	private static  final String NAME="HDFC";
	
	public void createAccount(String document) {
		if(verifyDocument(document)) {
			System.out.println("Account create");
		}else {
			System.out.println("NOPE!!!");
		}
		
	}

	public abstract boolean verifyDocument(String document);
	

}
