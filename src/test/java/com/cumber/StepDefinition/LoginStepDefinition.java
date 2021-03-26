package com.cumber.StepDefinition;


import org.openqa.selenium.WebDriver;

import com.cucumbe.org.Cucumbe.Bc1;
import com.cucumber.Runner.Runner;
import com.cucumber.helper.FileReadManager;
import com.cucumber.helper.PageObjectManager;
import cucumber.api.java.en.*;
//import junit.framework.Assert;

public class LoginStepDefinition extends Bc1 {
	public static WebDriver driver1=Runner.driver1;
	//LoginPage l=new LoginPage(driver1) ;
	PageObjectManager pom = new PageObjectManager(driver1);
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		//navigateUrl("https://adactinhotelapp.com/");
		String url = FileReadManager.getInstance().getCrInstance().geturl();
		navigateUrl(url);
			
	}
	
	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		//String userName = FileReadManager.getInstance().getCrInstance().getUserName();
		//send1(pom.getLp().getUser(),userName);
		send1(pom.getLp().getUser(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg) throws Throwable {
		//String pass = FileReadManager.getInstance().getCrInstance().name();
		//send1(pom.getLp().getPassword(),pass);
		send1(pom.getLp().getPassword(), arg);
	}

	@Then("^user verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
		ck(pom.getLp().getLog());
		
	}


}
