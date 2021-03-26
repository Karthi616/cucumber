package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Karthi {
	@Before
	public void beforesn() {
		System.out.println("MY NAME IS KARTHI");
		
	}
	@After
	public void aftersn() {
		System.out.println("Thanks");
		
	}
}
