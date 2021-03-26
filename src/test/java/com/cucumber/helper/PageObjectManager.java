package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import Pom.LoginPage;
import Pom.Payment;
import Pom.searchhostel;

public class PageObjectManager {
	public static WebDriver driver1;
	private LoginPage lp;
	private searchhostel s1;
	
	private Payment p1;
	
	
	public PageObjectManager(WebDriver mdriver) {
		this.driver1 = mdriver;
	}
	public LoginPage getLp() {
		lp = new LoginPage(driver1);
		return lp;
	}
	public searchhostel getSw() {
		s1 = new searchhostel(driver1);
		return s1;
	}
	public Payment getM() {
		p1 = new Payment(driver1);
		return p1;
	}
	
}
