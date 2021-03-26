package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver1;
	@FindBy(id="radiobutton_0")
	private WebElement rb;
	@FindBy(id="continue")
	private WebElement con;
	@FindBy(id="first_name")
	private WebElement Fn;
	@FindBy(id="last_name")
	private WebElement ln;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement cc;
	@FindBy(id="cc_type")
	private WebElement ct;
	@FindBy(id="cc_exp_month")
	private WebElement ct1;
	@FindBy(id="cc_exp_year")
	private WebElement ct2;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement book;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
     private WebElement logo;
	
	public Payment(WebDriver Ldriver2) {
		this.driver1=Ldriver2;
		PageFactory.initElements(driver1, this);
		
		
	}
	
	public WebElement getRb() {
		return rb;
	}
	public WebElement getCon() {
		return con;
	}
	public WebElement getFn() {
		return Fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getCt() {
		return ct;
	}
	public WebElement getCt1() {
		return ct1;
	}
	public WebElement getCt2() {
		return ct2;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getLogo() {
		return logo;
	}
	
	
}
