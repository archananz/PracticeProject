package practice.demo.tests;


import org.junit.jupiter.api.Test;

import practice.demo.driver.util.BaseTest;
import practice.demo.pages.HomePage;

public class Basictest extends BaseTest {
    @Test
    public void test() {
        HomePage homepage = new HomePage(getDriver());
        homepage.GoToUrl();
        homepage.ClickMyAccount();
    }

}
