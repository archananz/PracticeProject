package practice.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.demo.driver.util.BasePage;
import practice.demo.util.Property;

public class HomePage extends BasePage {
	public WebDriverWait wait;

    public HomePage(WebDriver driver ) {
        super(driver, "ONLINE STORE | Toolsqa Dummy Test site");      
    }

    @FindBy(id = "account")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//*[contains(@class,'search')])[2]")
   	private WebElement searchField;
    
    @FindBy(id = "log")
    private WebElement username;
    
    @FindBy(id = "pwd")
    private WebElement password;
    
    @FindBy(id = "login")
    private WebElement loginbutton;
    
    
    public void clickMyAccount() {
        myAccountButton.click();
    }
    
	public void searchForAProduct(String value) {
		searchField.sendKeys(value);		
		searchField.sendKeys(Keys.ENTER);

	}
	
	public void enterUserName() {
		//WebElement username = getDriver().findElement(By.id("log"));
		//wait.until(ExpectedConditions.textToBePresentInElement(username, "dummyuser"));
		username.sendKeys("dummyuser");
	}
	
	public void enterPassword() {
		//WebElement password = getDriver().findElement(By.id("pwd"));
		password.sendKeys("Password1");
	}
	public void clickLoginButton() {
		//wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		loginbutton.click();
	}

}
