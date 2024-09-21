package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Maven_ProjectClass.BaseClass;

public class LoginPage extends BaseClass {
	public WebDriver driver;

	@FindBy(xpath = "//a[@data-nav-role=\"signin\"]")
	private WebElement signin;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(id = "signInSubmit")
	private WebElement signinButton;

	@FindBy(xpath = "//*[contains(text(), 'We cannot find an a')]")
	private WebElement incorrectEmail;

	@FindBy(xpath = "//div[contains(text(), 'nter your')]")
	private WebElement blankEmail;

	@FindBy(xpath = "//*[@class='a-list-item']")
	private WebElement incorrectPassword;

	@FindBy(xpath = "//div[contains(text(), 'Enter your pa')]")
	private WebElement blankPassword;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void validLogin() {

		UrlLaunch("https://www.amazon.in/");
		click(driver, signin);
		passInput(email, "sriram.borntokill@gmail.com");
		click(driver, submit);
		passInput(password, "Merit@123");
		click(driver, signinButton);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		System.out.println("Title is correct");
	}

	public void incorrectEmailLogin() {

		UrlLaunch("https://www.amazon.in/");
		click(driver, signin);
		passInput(email, "sriram.borntokill@gmailcom");
		click(driver, submit);
		passInput(password, "Merit@123");
		click(driver, signinButton);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("incorrect Email Login completed");

	}

	public void emptyEmailLogin() {

		UrlLaunch("https://www.amazon.in/");
		click(driver, signin);
		passInput(email, "");
		click(driver, submit);
		passInput(password, "Merit@123");
		click(driver, signinButton);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Empty Email Login completed");

	}

	public void incorrectPasswordLogin() {

		UrlLaunch("https://www.amazon.in/");
		click(driver, signin);
		passInput(email, "sriram.borntokill@gmailcom");
		click(driver, submit);
		passInput(password, "Merit@1234");
		click(driver, signinButton);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Incorrect Password Login completed");

	}
	
	public void emptyPasswordLogin() {

		UrlLaunch("https://www.amazon.in/");
		click(driver, signin);
		passInput(email, "sriram.borntokill@gmailcom");
		click(driver, submit);
		passInput(password, "");
		click(driver, signinButton);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Empty Password Login completed");

	}
	
	public void incorrectEmailIncorrectPasswordLogin() {

		UrlLaunch("https://www.amazon.in/");
		click(driver, signin);
		passInput(email, "sriram.borntokill@gmailcom");
		click(driver, submit);
		passInput(password, "");
		click(driver, signinButton);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Empty Password Login completed");

	}

}
