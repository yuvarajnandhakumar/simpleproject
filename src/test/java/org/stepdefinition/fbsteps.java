package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fbsteps {

	public static WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();  //recent
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome launced by webdriver manager");	
	}

	@And("use enter fb url")
	public void use_enter_fb_url() {
		driver.get("https://www.facebook.com/");

	}

	@Then("user enter credentials")
	public void user_enter_credentials() throws InterruptedException  {
		driver.findElement(By.id("email")).sendKeys("yuvaraj@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("yuvarajsdfsdcom");
		Thread.sleep(2000);

		//throw new NullPointerException();  // user throws exception during program  // one exception

	}

	@And("clicks login button")
	public void clicks_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys("yuvarajsdfsdcom");
		System.out.println("login button clicked");
	}
	
	
	
	@And("use enter fb url {string}")
	public void use_enter_fb_url(String url) {
	    
		driver.get(url);

	}

	@Then("user enter credentials {string} {string}")
	public void user_enter_credentials(String uname, String pwd) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
	}


}
