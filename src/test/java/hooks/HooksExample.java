package hooks;

import com.cucumbe.org.Cucumbe.Bc1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksExample extends Bc1 {
	@Before
	  public void before(Scenario scenario) {
	  System.out.println(scenario.getName()); }
	  @After
	  public void after(Scenario scenario) throws Throwable {
	 System.out.println(scenario.getStatus());
	 if(scenario.isFailed())
	 {
}
	 screenshot("C:\\Users\\USER\\eclipse-workspace\\Cucumbe\\Screenshot\\n4m.png",scenario.getId());
	 //System.out.println(("status =  "+ scenario.getId()));
	 
	  }
}