package com.bank;

public abstract class BandraBranch extends MumbaiBranch{

	@Override
	public boolean verifyDocument(String document) {
		if(document.equalsIgnoreCase("passport")) {
			return true;
		}else {
			return false;
		}
	}

	

}
