package com.cucumber.helper;

import com.cucumbe.org.Cucumbe.Bc1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Bc1{
	
	@Before
	public void beforesn() {
		System.out.println("MY NAME IS KARTHI");
		
	}
	@After
	public void aftersn() {
		System.out.println("Thanks");
		
	}
	/*public void before(Scenario scenario) {
 System.out.println(scenario.getName());
	}
	@After()
	public void before1(Scenario scenario) throws Throwable {
 System.out.println(scenario.getStatus());
 if(scenario.isFailed())
 {
	 screenshot("‪C:\\Users\\USER\\Desktop\\New folder\\kk.png");
 }*/
	
}
