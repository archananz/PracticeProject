package practice.demo.driver.util;

import java.util.Arrays;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.demo.verification.Verifier;

public abstract class BasePage {

    private WebDriver driver;
    private final Verifier[] verifiers;

    public BasePage(WebDriver driver,final Verifier... verifiers) {
        this.driver = driver;
        this.verifiers = verifiers;
        PageFactory.initElements(driver, this);
       
    }
    
    public WebDriver getDriver() {
    	return driver;
    }
    
    private void waitForLoad(WebDriver driver) {
        new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
    
    public void checkPage() {  	
    	waitForLoad(driver);
    	checkVerifiers(verifiers);
    }
    
    private void checkVerifiers(final Verifier... verifiers) {
    	if(verifiers.length == 0) {
                return ;
    	}
    	Arrays.asList(verifiers).forEach((verifierItem) -> verifierItem.verify(getDriver()));
    }

}
