package com.utility;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook myWorkBook=new XSSFWorkbook(System.getProperty("user.dir")+"//testData//LoginExcel.xlsx");
		XSSFSheet mySheet=myWorkBook.getSheet("LoginData");
//		XSSFRow row=mySheet.getRow(2);
//		String value=row.getCell(0).getStringCellValue();
//		
//		System.out.println(value);
		
		XSSFRow myHeader=mySheet.getRow(0);
		int totalNoOfCols=myHeader.getLastCellNum();
		int lastIndexOfRows=mySheet.getLastRowNum();
		
		System.out.println(totalNoOfCols);
		System.out.println(lastIndexOfRows);
		
		String myData[][]=new String[lastIndexOfRows+1][totalNoOfCols];
		
		XSSFRow myRow;
		XSSFCell myCell;
		
		for (int rowIndex = 0; rowIndex <= lastIndexOfRows; rowIndex++) {
			for (int colIndex = 0; colIndex < totalNoOfCols; colIndex++) {
				myRow=mySheet.getRow(rowIndex);
				myCell=myRow.getCell(colIndex);
//				System.out.print(myCell.getStringCellValue()+" ");
				myData[rowIndex][colIndex]=myCell.getStringCellValue();
				
			}
			System.out.println(" ");
		}

	}

}
