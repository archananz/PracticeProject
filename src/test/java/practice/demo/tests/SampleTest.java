package practice.demo.tests;


import org.junit.jupiter.api.Test;

import practice.demo.driver.util.BaseTest;
import practice.demo.pages.HomePage;

public class SampleTest extends BaseTest {
	
	
    @Test
    public void testSample() {
        HomePage homepage = new HomePage(getDriver());
        homepage.goToUrl();
        homepage.clickMyAccount();
    }

}
