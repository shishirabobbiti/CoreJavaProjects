package com.testId;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestId {

	public static void main(String[] args) throws IOException {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		StringBuilder s=new StringBuilder();
		File file = new File("src\\main\\resources\\TestId.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheetAt(0);
		int rowSize = sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowSize; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String status = row.getCell(1).getStringCellValue();
			System.out.println(status);
//			if (status.equalsIgnoreCase("Completed")) {
//				Integer value = (int) cell.getNumericCellValue();
//				Iterator<Integer> it=h.iterator();
//				while(it.hasNext()) {
//					s.append(it.next()).append(" or ");
//				}
//				
//			}
//			System.out.println(s.toString());
		}
		
		
		
		
	}

}
