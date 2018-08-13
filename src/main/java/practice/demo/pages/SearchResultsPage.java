package practice.demo.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice.demo.driver.util.BasePage;
import practice.demo.verification.PageTitleVerifier;

public class SearchResultsPage extends BasePage {
	
	


	public SearchResultsPage(WebDriver driver) {
		super(driver,  new PageTitleVerifier("Search Result"));
	}
	
	@FindBy(xpath = "//div[@class='product_grid_item product_view_32']")
	private WebElement iphone5;

	public void clickIphone5() {
		iphone5.click();
	}
	
}