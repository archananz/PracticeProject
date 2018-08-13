package practice.demo.pages;

import org.openqa.selenium.WebDriver;

import practice.demo.driver.util.BasePage;
import practice.demo.verification.PageTitleVerifier;

public class YourAccountPage extends BasePage {

	public YourAccountPage(final WebDriver driver) {
		super(driver,  new PageTitleVerifier("Your Account | ONLINE STORE"));
	}

}
