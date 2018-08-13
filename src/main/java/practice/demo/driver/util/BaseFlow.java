package practice.demo.driver.util;

import org.openqa.selenium.WebDriver;

public class BaseFlow {

	private WebDriver driver;
	
	public BaseFlow(WebDriver driver) {
      this.driver = driver;		
	}
	
	public WebDriver getDriver() {
		return driver;
	}		

}
