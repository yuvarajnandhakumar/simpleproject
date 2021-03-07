package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.commonactions.CommonMethod;
import org.locator.AddCusLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Addcustomer extends CommonMethod{

	
	AddCusLocator tl =new AddCusLocator();
	CommonMethod co = new CommonMethod();
	
	@Given("launch and verify url")
	public void launch_and_verify_url() {

			
		driver.get("http://www.demo.guru99.com/telecom/");
		String urlvalue = driver.getCurrentUrl();
		System.out.println(urlvalue);
	}

	@And("click add customer link")
	public void click_add_customer_link() throws InterruptedException {
		//tl.getAddcustomer().click();
		co.submit(tl.getAddcustomer());
	}

	//normal declaration
	@Then("fill values for firstname lastname normal")
	public void fill_values_for_firstname_lastname_normal() throws InterruptedException {
		co.wait2sec();
		//tl.getFname().sendKeys("ezhil");
		co.insert(tl.getFname(), "ezhil");
		tl.getLname().sendKeys("explode");
		Thread.sleep(2000);

	}

	//onedim list
	@Then("fill values for firstname lastname using onedim list")
	public void fill_values_for_firstname_lastname_using_onedim_list(DataTable onedlist) throws InterruptedException {
		Thread.sleep(2000);

		List<String> oned = onedlist.asList();

		tl.getFname().sendKeys(oned.get(1));  
		Thread.sleep(2000);
		tl.getLname().sendKeys(oned.get(0));
		Thread.sleep(2000);
	}

	//one dim map
	@Then("fill values for firstname lastname using onedim map")
	public void fill_values_for_firstname_lastname_using_onedim_map(DataTable onedmap) throws InterruptedException {
		Map<String, String> asMap = onedmap.asMap(String.class, String.class);

		
		tl.getFname().sendKeys(asMap.get("firstname"));
		tl.getLname().sendKeys(asMap.get("lastname"));
	}

	//two dim map
	@Then("fill values for firstname lastname using twodim map")
	public void fill_values_for_firstname_lastname_using_twodim_map(DataTable twodmap) throws InterruptedException {

		List<Map<String, String>> asMaps = twodmap.asMaps(String.class, String.class);
		Thread.sleep(2000);
		tl.getFname().sendKeys(asMaps.get(0).get("firstname"));
		tl.getLname().sendKeys(asMaps.get(2).get("lastname"));

	}
	//two dim list
	@Then("fill values for firstname lastname using twodim list")
	public void fill_values_for_firstname_lastname_using_twodim_list(DataTable twpdlist) throws InterruptedException {

		List<List<String>> aslists = twpdlist.asLists();
		Thread.sleep(3000);
		tl.getFname().sendKeys(aslists.get(0).get(1));
		tl.getLname().sendKeys(aslists.get(1).get(0));

	}


	@Then("pass value for <{string}> <{string}>")
	public void pass_value_for(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		tl.getFname().sendKeys(string);
		tl.getLname().sendKeys(string2);
	}

	@Then("pass value for firstname and lastname {string} {string}")
	public void pass_value_for_firstname_and_lastname(String fn, String ln) throws InterruptedException 
	{
		Thread.sleep(2000);
		tl.getFname().sendKeys(fn);
		tl.getLname().sendKeys(ln);
	}

	@Then("close browser")
	public void close_browser() 
	{
		driver.close();
	}


}
