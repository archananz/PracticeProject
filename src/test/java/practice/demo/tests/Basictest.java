package practice.demo.tests;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import practice.demo.pages.HomePage;
import practice.selenity.driver.util.BaseTest;

public class Basictest extends BaseTest {
    @Test
    public void test() throws IOException {
        getDriver().get("http://store.demoqa.com");
        HomePage homepage = new HomePage(getDriver());
        homepage.ClickMyAccount();
        // Assert.That();
    }

}
