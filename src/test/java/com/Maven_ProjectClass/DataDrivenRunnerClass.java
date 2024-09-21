package com.Maven_ProjectClass;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelFile2;

public class DataDrivenRunnerClass {
	

		
		public static void main(String[] args) throws InvalidFormatException, IOException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			String username = ReadExcelFile2.getParticularCellData(1, 1);
			
			driver.findElement(By.name("email")).sendKeys(username);
			
            String password = ReadExcelFile2.getParticularCellData(1,1);
			
			driver.findElement(By.name("pass")).sendKeys(password);
			
			
		}
	}


