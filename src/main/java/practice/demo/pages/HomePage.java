package practice.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import practice.selenity.driver.util.BasePage;

public class HomePage extends BasePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "account")
    WebElement MyAccountButton;

    public void ClickMyAccount() {
        MyAccountButton.click();
    }

}
