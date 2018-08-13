package practice.demo.flows;

import org.openqa.selenium.WebDriver;

import practice.demo.driver.util.BaseFlow;
import practice.demo.pages.HomePage;
import practice.demo.pages.YourAccountPage;
import practice.demo.util.Property;

public class LoginFlow extends BaseFlow {

	public LoginFlow(final WebDriver driver) {
		super(driver);
		getDriver().get(Property.TEST_APPLICATION_URL.get());
	}
	
	public void Login() {
		HomePage homepage = new HomePage(getDriver());
		homepage.checkPage();
		homepage.clickMyAccount();
		homepage.enterUserName();
		homepage.enterPassword();
		homepage.clickLoginButton();
		YourAccountPage youraccountpage = new YourAccountPage(getDriver());
		youraccountpage.checkPage();
		
	}
	
	
}
