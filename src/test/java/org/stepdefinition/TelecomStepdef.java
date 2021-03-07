package org.stepdefinition;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TelecomStepdef {
	public static WebDriver driver;
	int row;
	int col;
/*	
	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();  //recent
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome launced by webdriver manager");
	}
*/
	@Then("user gets the column and row count")
	public void user_gets_the_column_and_row_count() {
		 row = driver.findElements(By.xpath("//table//th//parent::tr")).size();
		 col = driver.findElements(By.xpath("(//table//th//parent::tr)[1]/th")).size();
		 
		 List<WebElement> findElements = driver.findElements(By.xpath("//table//th//parent::tr"));
		 String windowHandle = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();

	}

	@And("User enter url")
	public void user_enter_url() {
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	}

	
	@Then("user gets onebyone value form webtable")
	public void user_gets_onebyone_value_form_webtable() {
		for(int k=1;k<col;k++){
			List<WebElement> findElements = driver.findElements(By.xpath("(//table//th//parent::tr)[1]/th["+k+"]"));
			for (WebElement header : findElements) {
				String text = header.getText();
				//System.out.print(text +"\t");
			}}
		
		
		for(int i=3;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
			List<WebElement> allvalues = driver.findElements(By.xpath("(//table//th//parent::tr)["+i+"]/td["+j+"]"));	
		
			for (WebElement header : allvalues) {
				String text = header.getText();
				//System.out.print(text +"\t" +"\t");
				//to verify the particular text inn found or not
				if(text.equals("Mecca"))
				{
					System.out.print(text +"\t" +"\t");
				}
			}
			
		}
			System.out.println();
		}
		
		
	}

	@Then("user close the window")
	public void user_close_the_window() {
	   driver.close();
	}

	@Then("user gets last row value form webtable")
	public void user_gets_last_row_value_form_webtable() {
	    
	}
	

	

}
