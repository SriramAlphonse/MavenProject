package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Maven_ProjectClass.BaseClass;

public class CrossBrowser extends BaseClass {
	@Ignore
	@Test
	private void chrome() {
		BrowserLaunch("chrome");
		UrlLaunch("https://www.google.com/");
		System.out.println("Chrome Browser Launched");
		Terminate();
	}
	@Test(enabled = true)
	private void chrome1() {
		BrowserLaunch("chrome");
		UrlLaunch("https://www.google.com/");
		System.out.println("Chrome Browser1 Launched");
		Terminate();
	}
	@Test(enabled = true, expectedExceptions = ArithmeticException.class)
	private void chrome2() {
		BrowserLaunch("chrome");
		UrlLaunch("https://www.google.com/");
		System.out.println("Chrome Browser2 Launched");
		int a =10;
		System.out.println("The output is " + a/2);
		System.out.println("The output is " + a/0);
		Terminate();
	}
	@Test(priority = 6)
	private void edge() {
		BrowserLaunch("edge");
		UrlLaunch("https://www.google.com/");
		System.out.println("Edge Browser Launched");
		Terminate();
	}
	@Test(enabled = true, priority = 5, invocationCount = 2)
	private void friefox() {
		BrowserLaunch("firefox");
		UrlLaunch("https://www.google.com/");
		System.out.println("Firefox Browser Launched");
		Terminate();
	}
}
