package com.cucumbe.org.Cucumbe;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Bc1 {

	public static WebDriver driver1;

	public static WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver1 = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
				driver1 = new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver1 = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid browser name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver1;
	}

	public static void navigateUrl(String url) {
		driver1.navigate().to(url);
	}

	public static void send1(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void ck(WebElement element) {
		element.click();
	}

	public static void DropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}

	}
	
	  //ScreenShot BaseClass 
	public static void screenshot(String arg,String a1) throws
	  Throwable {
	  
	  try { TakesScreenshot ts = (TakesScreenshot) driver1; File srcFile =
	  ts.getScreenshotAs(OutputType.FILE); File dstFile = new File(arg);
	  FileUtils.copyFile(srcFile, dstFile); 
	  System.out.println(a1);} catch (Exception e) {
	  e.printStackTrace(); }
	 
	}
}
