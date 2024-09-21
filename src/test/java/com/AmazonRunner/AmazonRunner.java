package com.AmazonRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Amazon.LoginPage;
import com.Maven_ProjectClass.BaseClass;

public class AmazonRunner extends BaseClass {

	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = BaseClass.BrowserLaunch("Chrome");

	}

	@Test
	public void validLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		System.out.println("Valid Login completed");
	}

	@Test
	public void invalidEmailLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.incorrectEmailLogin();
		System.out.println("In-Valid Email Login completed");
	}
	
	@Test
	public void emptyEmailLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.emptyEmailLogin();
		System.out.println("Empty Email Login completed");

	}
	
	@Test
	public void incorrectPasswordLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.incorrectPasswordLogin();
		System.out.println("Incorrect Password completed");
	}
	
	@Test
	public void emptyPasswordLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.emptyPasswordLogin();
		System.out.println("Empty Password completed");
	}
	
	@Test
	public void incorrectEmailIncorrectPasswordLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.incorrectEmailIncorrectPasswordLogin();
		System.out.println("Incorrect Email and Incorrect Password completed");
	}

	@AfterTest
	public void Termination() {
		Terminate();

	}

}
