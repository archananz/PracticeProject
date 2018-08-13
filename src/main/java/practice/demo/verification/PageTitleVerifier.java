package practice.demo.verification;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

public class PageTitleVerifier implements Verifier {
	private final String expectedTitle;

	public PageTitleVerifier(final String expectedTitle) {
		this.expectedTitle = expectedTitle;
	}

	@Override
	public void verify(final WebDriver driver) {
    assertEquals(expectedTitle, driver.getTitle());		
	}

}
