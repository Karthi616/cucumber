package com.cumber.StepDefinition;
import org.openqa.selenium.WebDriver;

import com.cucumbe.org.Cucumbe.Bc1;
import com.cucumber.Runner.Runner;
import com.cucumber.helper.PageObjectManager;

import Pom.searchhostel;
import cucumber.api.java.en.*;
public class LoginHotelSearch extends Bc1 {
	
	public static WebDriver driver1=Runner.driver1;
	//searchhostel s1=new searchhostel(driver1);
	PageObjectManager pom = new PageObjectManager(driver1);
	@Given("^User select options \"([^\"]*)\" and select \"([^\"]*)\" as location details from dropdown bo$")
	public void user_select_options_and_select_as_location_details_from_dropdown_bo(String arg1, String arg2) throws Throwable {
		DropDown(pom.getSw().getLocation(),arg1,arg2);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as hotel name$")
	public void user_select_options_and_select_as_hotel_name(String arg1, String arg2) throws Throwable {
		DropDown(pom.getSw().getHotels(),arg1,arg2);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as room type$")
	public void user_select_options_and_select_as_room_type(String arg1, String arg2) throws Throwable {
		DropDown(pom.getSw().getRoom(),arg1,arg2);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\"  as no\\.of room$")
	public void user_select_options_and_select_as_no_of_room(String arg1, String arg2) throws Throwable {
		DropDown(pom.getSw().getNo(),arg1,arg2);
	}

	@When("^user enter check in date as \"([^\"]*)\"$")
	public void user_enter_check_in_date_as(String arg1) throws Throwable {
		send1(pom.getSw().getIin(),arg1);
	}

	@When("^user enter check out date as \"([^\"]*)\"$")
	public void user_enter_check_out_date_as(String arg1) throws Throwable {
		send1(pom.getSw().getOut(),arg1);
	}

	@When("^User select options \"([^\"]*)\" and select \"([^\"]*)\" as choice$")
	public void user_select_options_and_select_as_choice(String arg1, String arg2) throws Throwable {
		DropDown(pom.getSw().getAr(),arg1,arg2);
	}

	@When("^user select options \"([^\"]*)\" and select \"([^\"]*)\" as choice as enter\\.$")
	public void user_select_options_and_select_as_choice_as_enter(String arg1, String arg2) throws Throwable {
		DropDown(pom.getSw().getCr(),arg1,arg2);
	}

	@Then("^user click search button to verify$")
	public void user_click_search_button_to_verify() throws Throwable {
		ck(pom.getSw().getSub());
	}

}
