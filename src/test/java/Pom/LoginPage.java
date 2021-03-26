package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver1;
	
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement password ;
	@FindBy(id="login")
	private WebElement log;
	
	
	
	public LoginPage(WebDriver Ldriver) {
	this.driver1=Ldriver;
		PageFactory.initElements(driver1, this);
		
		
	}
	public WebElement getUser() {
		return user;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLog() {
		return log;
	}
	
	
	
	}
	

