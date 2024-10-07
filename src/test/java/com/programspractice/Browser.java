package com.programspractice;

public class Browser {
	
	private static Browser browser;
	
	private Browser() {}
	
	public static Browser getInstance() {
		if(browser==null) {
			browser=new Browser();
		}
		return browser;
	}

	public static void getMsg() {
		System.out.println("Browser Info");
	}
}
