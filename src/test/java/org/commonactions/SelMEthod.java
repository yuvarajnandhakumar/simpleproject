package org.commonactions;

import org.openqa.selenium.WebElement;

public interface SelMEthod {
	
	
	void launch();
	void insert(WebElement ele,String s); // for sendkeys
	void submit(WebElement ele) throws InterruptedException; // for clicks
	void wait2sec() throws InterruptedException;

}
