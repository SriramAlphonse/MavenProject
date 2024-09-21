package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelFile {

	private static void WriteData() throws IOException {

		File file = new File("C:\\Users\\srira\\OneDrive\\Desktop\\Data Driven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fis);

		// to create sheet
		book.createSheet("StudentNames").createRow(0).createCell(0).setCellValue("Names");
		// book.getSheet("StudentNames").createRow(0).createCell(0).setCellValue("Names");
		book.getSheet("StudentNames").createRow(1).createCell(0).setCellValue("ABC");
		book.getSheet("StudentNames").createRow(2).createCell(0).setCellValue("DEF");
		book.getSheet("StudentNames").createRow(3).createCell(0).setCellValue("GHI");
		book.getSheet("StudentNames").createRow(4).createCell(0).setCellValue("JKL");
		book.getSheet("StudentNames").createRow(5).createCell(0).setCellValue("MNO");

		// to create a new cell/replace cell with new value (getCell or CreateCell)

		book.getSheet("Sheet1").getRow(5).getCell(5).setCellValue("Sriram");
		// book.getSheet("Sheet1").getRow(5).createCell(5).setCellValue("Sriram");

		FileOutputStream fos = new FileOutputStream(file);
		book.write(fos);
		book.close();
	}

	public static void main(String[] args) throws IOException {
		WriteData();
		System.out.println("Data Written Successfully");

	}

}
