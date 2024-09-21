package com.AdactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ElementInterface.LoginPageInterface;
import com.Maven_ProjectClass.BaseClass;

public class AdactinLoginPagePOM extends BaseClass implements LoginPageInterface {
	
	private WebDriver driver;
	
	public AdactinLoginPagePOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = userName_id)
	private WebElement user;
	
	@FindBy(id = password_id)
	private WebElement pass;
	
	@FindBy (id = loginbutton_name)
	private WebElement login;

}
