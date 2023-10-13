package com.qa.tums.eng.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWrite {
	
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
//	private XSSFWorkbook workbook = null;
	private HSSFSheet sheet = null;
	private HSSFRow row   =null;
	private HSSFCell cell = null;
	private HSSFWorkbook wb = null;
	
	public boolean setCellData(String sheetName,String colName,int rowNum, String data){
		try{
			fis = new FileInputStream("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\src\\test\\resources\\Excelsheet\\ProductionLinks.xls"); 
			wb = new HSSFWorkbook(fis);
			

			if(rowNum<=0)
				return false;

			int index = wb.getSheetIndex(sheetName);
			int colNum=-1;
			if(index==-1)
				return false;


			sheet = wb.getSheetAt(index);


			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++){
				//System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equals(colName))
					colNum=i;
			}
			if(colNum==-1)
				return false;

			sheet.autoSizeColumn(colNum); 
			row = sheet.getRow(rowNum-1);
			if (row == null)
				row = sheet.createRow(rowNum-1);

			cell = row.getCell(colNum);	
			if (cell == null)
				cell = row.createCell(colNum);

			// cell style
			//CellStyle cs = workbook.createCellStyle();
			//cs.setWrapText(true);
			//cell.setCellStyle(cs);
			cell.setCellValue(data);

			fileOut = new FileOutputStream("C:\\Users\\sujsekar\\Desktop\\Automation Code\\git\\Automation-Code\\com.qa.tums.site.eng\\src\\test\\resources\\Excelsheet\\ProductionLinks.xls");

			wb.write(fileOut);

			fileOut.close();	

		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
