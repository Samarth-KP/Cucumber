package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@regression")
	public void setUp()
	{
		System.out.println("Setting up before scenario...");
	}
	
	@After("@smoke")
	public void tearDown()
	{
		System.out.println("Tearing down after scenario...");
	}
}
