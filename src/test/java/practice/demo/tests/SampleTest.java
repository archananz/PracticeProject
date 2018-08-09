package practice.demo.tests;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.demo.driver.util.BaseTest;
import practice.demo.flows.LoginFlow;
import practice.demo.pages.HomePage;
import practice.demo.util.Property;

public class SampleTest extends BaseTest {
	
    @Test
    public void testSample() {
    	getDriver().get(Property.TEST_APPLICATION_URL.get());
        HomePage homepage = new HomePage(getDriver());        
        homepage.checkPage();
        homepage.clickMyAccount();
    }
    
    @Test
    public void testSearchProduct() {
    	HomePage homepage = new HomePage(getDriver()); 
    	getDriver().get(Property.TEST_APPLICATION_URL.get());
    	homepage.checkPage();
    	homepage.searchForAProduct("iphone 5");
    	Assert.assertEquals(getDriver().getTitle(), "iphone 5 | Search Results | ONLINE STORE" );
    	
    }
    
    @Test
    public void loginTest() {
    	LoginFlow loginflow = new LoginFlow(getDriver());
    	loginflow.Login();
    	
    }

}
