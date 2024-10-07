package com.dataproviders;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.exceptions.CsvException;
import com.utility.TestUtility;

public class LoginDataProvider {
	
	@DataProvider(name="LoginData")
	public List<String[]> loginDP() throws IOException, CsvException {
		return TestUtility.readCSVFile("LoginData.csv");
	}
	
	@DataProvider(name="LoginExcelData")
	public String[][] loginDP2() throws IOException, CsvException {
		return TestUtility.readExcelFile();
	}

}
