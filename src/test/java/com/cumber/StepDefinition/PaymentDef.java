package com.cumber.StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumbe.org.Cucumbe.Bc1;
import com.cucumber.Runner.Runner;
import com.cucumber.helper.PageObjectManager;

import Pom.Payment;
import cucumber.api.java.en.*;
public class PaymentDef extends Bc1 {
	public static WebDriver driver1=Runner.driver1;
	//Payment p1=new Payment(driver1);
	PageObjectManager pom = new PageObjectManager(driver1);
	@Given("^User click radio button$")
	public void user_click_radio_button() throws Throwable {
		//Thread.sleep(5000);
	    ck(pom.getM().getRb());
	}

	@When("^user click continue button$")
	public void user_click_continue_button() throws Throwable {
	    ck(pom.getM().getCon());
	   // Assert.assertEquals("abc","945");
	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String arg1) throws Throwable {
		send1(pom.getM().getFn(),arg1);
	}

	@When("^User enter \"([^\"]*)\" as last name$")
	public void user_enter_as_last_name(String arg1) throws Throwable {
		send1(pom.getM().getLn(),arg1);
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String arg1) throws Throwable {
		send1(pom.getM().getAdd(),arg1);
	}

	@When("^user enter \"([^\"]*)\" as Credit card No\\.$")
	public void user_enter_as_Credit_card_No(String arg1) throws Throwable {
		send1(pom.getM().getCc(),arg1);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as answer$")
	public void user_select_options_and_select_as_answer(String arg1, String arg2) throws Throwable {
		DropDown(pom.getM().getCt(),arg1,arg2);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as no\\.$")
	public void user_select_options_and_select_as_no(String arg1, String arg2) throws Throwable {
		DropDown(pom.getM().getCt1(),arg1,arg2);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as year$")
	public void user_select_options_and_select_as_year(String arg1, String arg2) throws Throwable {
		DropDown(pom.getM().getCt2(),arg1,arg2);
	}

	@When("^user enter \"([^\"]*)\" as CVV No\\.$")
	public void user_enter_as_CVV_No(String arg1) throws Throwable {
		send1(pom.getM().getCvv(),arg1);
	}

	@When("^user click BOOK click button$")
	public void user_click_BOOK_click_button() throws Throwable {
	   ck(pom.getM().getBook());
	   Assert.assertEquals("abc","945");
	}

	@Then("^user click logo  button$")
	public void user_click_logo_button() throws Throwable {
	    ck(pom.getM().getLogo());
	}


}
