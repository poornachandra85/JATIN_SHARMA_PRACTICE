package com.bank;

public final class DelhiBranch extends Bank {
	


	@Override
	public boolean verifyDocument(String document) {
		if(document.equalsIgnoreCase("DL")) {
			return true;
		}else {
			return false;
		}
	}

}
