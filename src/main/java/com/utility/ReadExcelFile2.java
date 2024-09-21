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

public class ReadExcelFile2 {

	// to check with runner class
	public static String getParticularCellData(int rows, int column) throws InvalidFormatException, IOException {

		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		Workbook book = new XSSFWorkbook(file);

		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(rows);
		Cell cell = row.getCell(column);

		DataFormatter dataformater = new DataFormatter();
		String data = dataformater.formatCellValue(cell);

		return data;

	}

	public static void main(String[] args) throws InvalidFormatException, IOException {

		getParticularCellData(1, 3);
	}


}
