package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhostel {
	public static WebDriver driver1;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement no;
	@FindBy(id="datepick_in")
	private WebElement iin;
	@FindBy(id="datepick_out")
	private WebElement out;
	@FindBy(id="adult_room")
	private WebElement ar;
	@FindBy(id="child_room")
	private WebElement cr;
	@FindBy(id="Submit")
	private WebElement sub;
	
	
	public searchhostel (WebDriver Ldriver1) {
		this.driver1=Ldriver1;
		PageFactory.initElements(driver1, this);
		
		
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNo() {
		return no;
	}
	public WebElement getIin() {
		return iin;
	}
	public WebElement getOut() {
		return out;
	}
	public WebElement getAr() {
		return ar;
	}
	public WebElement getCr() {
		return cr;
	}
	public WebElement getSub() {
		return sub;
	}

}
