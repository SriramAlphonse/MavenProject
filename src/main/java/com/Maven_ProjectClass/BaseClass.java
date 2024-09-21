package com.Maven_ProjectClass;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	static WebDriver driver;

	public static ExtentReports extentReports;

	public static File file;

	// to launch browser

	public static WebDriver BrowserLaunch(String BrowserName) {

		if (BrowserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Broswer Is invalid");
		}

		driver.manage().window().maximize();
		return driver;
	}

	// to launch URL

	public static void UrlLaunch(String url) {
		driver.get(url);
	}

	// to get Current URL

	public static void CurrentURL(WebDriver driver, String url) {
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current URL is " + CurrentURL);
	}

	// to pass send keys

	public static void sendKeys(WebDriver driver, WebElement element, String value) {
		element.sendKeys(value);
	}

	// to close browser

	public static void close() {
		driver.close();
	}

	// to terminate browser

	public static void Terminate() {
		driver.quit();
	}

	// to click
	public static void click(WebDriver driver, WebElement element) {
		element.click();
	}
	
	public static void clickElement(WebDriver driver, WebElement element) { 
		  try { 
		   element.click(); 
		  } catch (Exception e) { 
		   // TODO Auto-generated catch block 
		   e.printStackTrace(); 
		  } 
		    
		 }
	// Action click

	public static void actionclick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}
	// to pass input

	public static void passInput(WebElement element, String value)

	{
		element.sendKeys(value);
	}

	public static void extentReportStart(String location) {
		extentReports = new ExtentReports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("java Version", System.getProperty("java.version"));

	}

	public static void extentReportTearDown(String location) throws IOException {
		extentReports.flush();
		file = new File(location);
		Desktop.getDesktop().browse((file).toURI());

	}

	public String takeScreenshots() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("Screenshot\\.png" + "_" + timestamp + ".png");
		FileUtils.copyFile(scrfile, destfile);
		return destfile.getAbsolutePath();
	}

}
