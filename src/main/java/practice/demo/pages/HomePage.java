package practice.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import practice.demo.driver.util.BasePage;
import practice.demo.util.Property;

public class HomePage extends BasePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "account")
    private WebElement myAccountButton;

    public void goToUrl()
    {
    	driver.get(Property.TEST_APPLICATION_URL.get());
    }
    public void clickMyAccount() {
        myAccountButton.click();
    }

}
