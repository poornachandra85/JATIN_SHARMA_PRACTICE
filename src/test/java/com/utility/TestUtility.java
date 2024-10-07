package com.utility;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.api.pojo.CreateJobPOJO;
import com.api.pojo.CustomerAddressPOJO;
import com.api.pojo.CustomerPOJO;
import com.api.pojo.CustomerProductPOJO;
import com.api.pojo.LoginRequestPOJO;
import com.api.pojo.ProblemPOJO;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.restassured.http.Header;

public class TestUtility {
	
	public static int jobID;
	
	
		public static LoginRequestPOJO getLoginPOJO(String username,String password) {
			return new LoginRequestPOJO(username, password);
		}
	
		public static CreateJobPOJO getCreateJobPOJO() {
				
				Faker faker=new Faker();
				String imei=faker.numerify("1234##########");
				SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
			
				CustomerPOJO customer=new CustomerPOJO(faker.name().firstName(), faker.name().lastName(), faker.numerify("98########"), faker.numerify("98########"), faker.internet().emailAddress(), faker.internet().emailAddress());
				CustomerAddressPOJO customerAddress=new CustomerAddressPOJO(faker.number().digits(4), faker.address().firstName(), faker.address().streetName(), faker.address().lastName(), faker.address().streetPrefix(), faker.numerify("#####"), faker.address().country(), faker.address().state());
				CustomerProductPOJO customerProduct=new CustomerProductPOJO(timeStampFormat.format(faker.date().birthday()), imei, imei, imei, timeStampFormat.format(faker.date().birthday()), 1, 1);
				
				List<ProblemPOJO> problemPOJO=new ArrayList<ProblemPOJO>();	
				problemPOJO.add(0, new ProblemPOJO(2, "Phone Not Working"));
				
				return new CreateJobPOJO(0, 2, 1, 1,customer,customerAddress,customerProduct,problemPOJO);
				
			}
		
		public static Object getPOJOObject(String JSON, Class<CreateJobPOJO> class1) {
				Gson gson=new Gson();
				return gson.fromJson(JSON, class1);
			}
		
		public static String getJSONObject(Object POJO) {
				Gson gson=new Gson();
				return gson.toJson(POJO);
				
			}
		
		public static String getTokenFor(String role) {
			LoginRequestPOJO  loginPOJO=null;
			if(role.equalsIgnoreCase("fd")) {
				loginPOJO=new LoginRequestPOJO("iamfd", "password");
			}else if(role.equalsIgnoreCase("sup")) {
				loginPOJO=new LoginRequestPOJO("iamsup", "password");
			}else if(role.equalsIgnoreCase("eng")) {
				loginPOJO=new LoginRequestPOJO("iameng", "password");
			}else if(role.equalsIgnoreCase("qc")) {
				loginPOJO=new LoginRequestPOJO("iamqc", "password");
			}else {
				loginPOJO=null;
			}
			
			String token=given()
					.when()
						.header(new Header("Content-Type","application/json"))
					.and()
						.body(getJSONObject(loginPOJO))
					.and()
						.log().all()
						.post("/v1/login")
					.then()
						.extract().jsonPath().getString("data.token");
			
			
			return token;
		}
		
		
		public static List<String[]> readCSVFile(String FileName) throws IOException, CsvException {
			File myCSVFile=new File(System.getProperty("user.dir")+"\\testData\\"+FileName);
			
			FileReader fileReader=new FileReader(myCSVFile);
			
			CSVReader csvReader=new CSVReader(fileReader);
			
			
//			System.out.println(Arrays.toString(csvReader.readNext()));
			
		List<String[]> dataList=csvReader.readAll();
		
		for (String[] strings : dataList) {
			for (String strings2 : strings) {
				System.out.print(strings2+" ");
				
			}
			System.out.println(" ");
		}	
		return dataList;
		}
		
		public static String[][] readExcelFile() throws IOException {
			XSSFWorkbook myWorkBook=new XSSFWorkbook(System.getProperty("user.dir")+"//testData//LoginExcel.xlsx");
			XSSFSheet mySheet=myWorkBook.getSheet("LoginData");
//			XSSFRow row=mySheet.getRow(2);
//			String value=row.getCell(0).getStringCellValue();
//			
//			System.out.println(value);
			
			XSSFRow myHeader=mySheet.getRow(0);
			int totalNoOfCols=myHeader.getLastCellNum();
			int lastIndexOfRows=mySheet.getLastRowNum();
			
			System.out.println(totalNoOfCols);
			System.out.println(lastIndexOfRows);
			
			String myData[][]=new String[lastIndexOfRows][totalNoOfCols];
			
			XSSFRow myRow;
			XSSFCell myCell;
			
			for (int rowIndex = 1; rowIndex <= lastIndexOfRows; rowIndex++) {
				for (int colIndex = 0; colIndex < totalNoOfCols; colIndex++) {
					myRow=mySheet.getRow(rowIndex);
					myCell=myRow.getCell(colIndex);
//					System.out.print(myCell.getStringCellValue()+" ");
					myData[rowIndex-1][colIndex]=myCell.getStringCellValue();
					
				}
				System.out.println(" ");
			}
			return myData;
		}

}
