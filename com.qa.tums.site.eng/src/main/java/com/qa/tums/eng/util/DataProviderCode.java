package com.qa.tums.eng.util;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;

import com.qa.baseClass.BaseClass;

public class DataProviderCode extends BaseClass{

	String [][]data = null;

	@DataProvider(name="Caltrate")
	public String[][] loginDataProvider() throws  IOException, BiffException  {
		data=LogiData();
		return data;
	}

	public String[][] LogiData() throws  IOException, BiffException {
		FileInputStream fileInput = new FileInputStream(loadConfig("checkListConfig.properties").getProperty("WorkbookFilePath"));
		
		Workbook workbook = Workbook.getWorkbook(fileInput);
		
		Sheet sheet = workbook.getSheet(loadConfig("checkListConfig.properties").getProperty("SheetNameDummyCheck"));
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		String testData[][]= new String [rows-1][columns];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				testData[i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}
}
