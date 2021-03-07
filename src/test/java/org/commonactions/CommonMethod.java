package org.commonactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethod implements SelMEthod{
	
	public static WebDriver driver;
	
	public void launch()
	{
		WebDriverManager.chromedriver().setup();  //recent
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chrome launced by webdriver manager");
	}
	
	
	public void insert(WebElement ele,String s)
	{
		try{
		ele.sendKeys(s);
		Thread.sleep(2000);
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
	
	
	public void submit(WebElement ele) throws InterruptedException 
	{
		ele.click();
		Thread.sleep(2000);
	}
	
	public void wait2sec() throws InterruptedException
	{
		Thread.sleep(2000);
	}


	
	
	
}
