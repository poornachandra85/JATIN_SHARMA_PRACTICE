package com.bank;

public class Runner {

	public static void main(String[] args) {
		Bank neeta=new ABCBranch();
		neeta.createAccount("Passport");
		((BandraBranch) neeta).demo();
		
		Bank virag=new DelhiBranch();
		virag.createAccount("DL");

	}

}
