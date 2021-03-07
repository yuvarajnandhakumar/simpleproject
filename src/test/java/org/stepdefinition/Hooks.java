package org.stepdefinition;

import org.commonactions.CommonMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonMethod{
	
	@Before
	public void beforefun()
	{
		launch();
	}
	
	//feature
	
	@After
	public void afterfun()
	{
		driver.quit();
	}

}
