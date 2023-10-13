package com.qa.tums.eng.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.qa.baseClass.BaseClass;

public class ExcelWriter  extends BaseClass{

	public boolean setCellData(String sheetName,String colName,int rowNum, String data) throws IOException{


		try {
			// Open the existing workbook
			String filePath = "C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\src\\test\\resources\\Excelsheet\\ProductionLinks.xls";
			FileInputStream file = new FileInputStream(new File(filePath));
			Workbook workbook = new HSSFWorkbook(file);

			// Get the sheet you want to write to
			Sheet sheet = workbook.getSheet("RoootRelative");

			// Define the data to be written to the sheet
			String[] dat = {"Row 1, Column 2", "Row 2, Column 2", "Row 3, Column 3"};

			// Write the data to the sheet
			int rowNu = sheet.getLastRowNum() + 1;
			Row row = sheet.createRow(rowNum);
			for (int i = 0; i < dat.length; i++) {
				Cell cell = row.createCell(i);
				cell.setCellValue(dat[i]);
			}

			// Save the workbook to a file
			FileOutputStream outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
			outputStream.close();

			// Quit the Selenium driver
			driver.quit();

		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}
}
