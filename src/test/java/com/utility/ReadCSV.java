package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadCSV {

	public static void main(String[] args) throws IOException, CsvException  {
		
		File myCSVFile=new File(System.getProperty("user.dir")+"\\testData\\LoginData.csv");
		
		FileReader fileReader=new FileReader(myCSVFile);
		
		CSVReader csvReader=new CSVReader(fileReader);
		
		
//		System.out.println(Arrays.toString(csvReader.readNext()));
		
	List<String[]> dataList=csvReader.readAll();
	
	for (String[] strings : dataList) {
		for (String strings2 : strings) {
			System.out.print(strings2+" ");
			
		}
		System.out.println(" ");
	}
		
		

	}

}
