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

public class ReadExcelFile3 {

	private static void getParticularRowMultipleCellData() throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet("Sheet1");

		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Number of Rows : " + lastRowNum);

		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Columns : " + lastCellNum);

		Row row = sheet.getRow(1);

		for (int i = 0; i < lastCellNum; i++) {
			Cell cell = row.getCell(i);
			DataFormatter dataformat1 = new DataFormatter();
			String formatCellValue1 = dataformat1.formatCellValue(cell);
			System.out.println(formatCellValue1);

		}

	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		getParticularRowMultipleCellData();

	}

}
