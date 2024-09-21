package com.TestNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "Athletic Track Sports")
	private void running() {
		System.out.println("Running");
	}

	@Test(groups = "Athletic Track Sports")
	private void marathon() {
		System.out.println("marathon");
	}

	@Test(groups = "Athletic Track Sports")
	private void javelinThrow() {
		System.out.println("Javenlin Throw");
	}

	@Test(groups = "Field Sports")
	private void cricket() {
		System.out.println("Cricket");
	}
	
	@Test(groups = "Field Sports")
	private void football() {
		System.out.println("Football");
	}
	
	@Test(groups = "Field Sports")
	private void handball() {
		System.out.println("Handball");
	}
	
	@Test(groups = "Swimming")
	private void freeStyle() {
		System.out.println("Free Style");
	}
	
	@Test(groups = "Swimming")
	private void butterfly() {
		System.out.println("Butterfly");
	}
	
	@Test(groups = "Swimming")
	private void backStroke() {
		System.out.println("back Stroke");
	}

}
