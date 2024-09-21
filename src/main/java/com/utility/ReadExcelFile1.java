package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile1 {

	public static void getParticularCellData1(int rows, int column) throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		Workbook book = new XSSFWorkbook(file);

		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(rows);
		Cell cell = row.getCell(column);

		double data = cell.getNumericCellValue(); // to get the numeric value
		System.out.println(data);

	}

	public static void getParticularCellData2(int rows, int column) throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		Workbook book = new XSSFWorkbook(file);

		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(rows);
		Cell cell = row.getCell(column);

		String data = cell.getStringCellValue(); // to get the string value
		System.out.println(data);

	}

	public static void getParticularCellData3() throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		Workbook book = new XSSFWorkbook(file);

		Sheet sheet = book.getSheetAt(0); // to check with row/column index
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);

		String data = cell.getStringCellValue(); // to get the string value
		System.out.println(data);

	}

	public static void main(String[] args) throws InvalidFormatException, IOException {
		getParticularCellData1(4, 2);
		getParticularCellData2(3, 1);
		getParticularCellData3();
	}
}
