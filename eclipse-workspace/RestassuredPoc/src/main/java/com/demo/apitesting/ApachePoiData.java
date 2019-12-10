package com.demo.apitesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePoiData {

public static  String fetch_data_from_excelfile(String sheetnumber, int rownumber, int cellnumber)
{
	FileInputStream file = null;
	Workbook wb = null;
	Sheet s;
	Row row;
	Cell cell;
	
	try {
		 file= new FileInputStream("C:\\Users\\gomathi.karnan\\eclipse-workspace\\RestassuredPoc\\resources\\apachi doc.xlsx");
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		wb = WorkbookFactory.create(file);
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 s=wb.getSheet(sheetnumber);
	row=s.getRow(rownumber);
	cell=row.getCell(cellnumber);
	
	return cell.getStringCellValue();
	
	
}
}
