package com.ExcelOps;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelread {

	/*public static void main(String[] args) throws Exception {
		DataFormatter df  = new DataFormatter();
		FileInputStream fis = new FileInputStream("TestData.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		
		int rows= sh.getLastRowNum();// to know the number of rows having data
		for(int i=0;i<=rows;i++) {
			int cols = sh.getRow(i).getLastCellNum();// to know the columns for each row
			for(int j=0; j<cols;j++) {
				Cell c = sh.getRow(i).getCell(j);
				System.out.print(df.formatCellValue(c)+"  ");
			}
			System.out.println();
		}
	}*/
	
	
	public static String getCelldata(int row, int col)throws Exception {
		DataFormatter df  = new DataFormatter();
		FileInputStream fis = new FileInputStream("TestData.xls");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		
		return df.formatCellValue(sh.getRow(row).getCell(col));
	}
	
	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(getCelldata(0, 0));
	}
	
	
	
	
	
	
}
