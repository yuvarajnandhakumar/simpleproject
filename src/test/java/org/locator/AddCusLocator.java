package org.locator;

import org.commonactions.CommonMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Addcustomer;
import org.stepdefinition.TelecomStepdef;

public class AddCusLocator extends CommonMethod{
	
	public AddCusLocator() 
	{	
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addcustomer;
	
	@FindBy(name="fname")  //pojo plain old java object- locator private
	private WebElement fname;
	
	@FindBy(name="lname")
	private WebElement lname;
	
	private int x=10;  // encapsulation - datatype

	

	public WebElement getAddcustomer() {
		return addcustomer;
	}


	public WebElement getFname() {
		return fname;
	}



	public WebElement getLname() {
		return lname;
	}



	public int getX() {
		return x;
	}
	
	
	

}
