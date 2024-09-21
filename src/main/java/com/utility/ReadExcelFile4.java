package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile4 {

	private static void AllData() throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet("Sheet1");

		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Number of Rows : " + lastRowNum);

		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Columns : " + lastCellNum);

		for (int i = 1; i <= lastRowNum; i++) {  //i= 0 for header
			Row row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = row.getCell(j);
				DataFormatter dataformat = new DataFormatter();
				String formatCellValue = dataformat.formatCellValue(cell);
				System.out.println(formatCellValue);

			} 
		}

	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		AllData();

	}

}
