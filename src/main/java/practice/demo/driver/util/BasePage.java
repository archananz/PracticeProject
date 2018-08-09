package practice.demo.driver.util;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    private WebDriver driver;
    
    private String pageTitle;

    public BasePage(WebDriver driver, String pageTitle) {
        this.driver = driver;
        this.pageTitle = pageTitle;
        PageFactory.initElements(driver, this);
       
    }
    
    public WebDriver getDriver() {
    	return driver;
    }
    
    private void waitForLoad(WebDriver driver) {
        new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
    
    public boolean checkPage() {  	
    	waitForLoad(driver);
    	boolean istitlecorrect = driver.getTitle().contains(pageTitle);
    	System.out.println(driver.getTitle());
    	return istitlecorrect;
    	
    	//assertEquals(pageTitle, driver.getTitle());
    	//System.out.println(driver.getTitle());
    }

}
