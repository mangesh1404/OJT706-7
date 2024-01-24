package com.ExcelOps;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	public static Sheet sh= null;
	public static Row row=null;
	public static Cell c = null;

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("TestData.xls");
		Workbook wb = WorkbookFactory.create(fis);
		if(wb.getSheet("Test")==null) {
			sh = wb.createSheet("Test");
			row=sh.createRow(5);
			c= row.createCell(3);
		}else {
			sh= wb.getSheet("Test");
			if(sh.getRow(5)==null) {
				row=sh.createRow(5);
				c= row.createCell(3);
			}else {
				row=sh.getRow(5);
			if(row.getCell(3)==null)
				c= row.createCell(3);
			else
				c=row.getCell(3);		
		}
		}
		c.setCellValue("TheKiranAacademy");
		FileOutputStream fos = new FileOutputStream("TestData.xls");
		wb.write(fos);
		wb.close();
		fos.close();
	}
}
