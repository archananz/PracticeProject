package practice.demo.driver.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ExtensionPoint.class)
public abstract class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = initializeDriver();
        }

        return driver;
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
        }

        driver = null;
    }

    private WebDriver initializeDriver() {
        Properties properties = new Properties();
        InputStream ins = BasePage.class.getClassLoader().getResourceAsStream("default.properties"); // Relative path
        // FileInputStream fis = new FileInputStream("C:\\Practice Automation\\PracticeProject\\src\\main\\resources\\Default.Properties"); -- This is absolute path
        try {
            properties.load(ins);
            String BROWSER = properties.getProperty("browser");
            System.out.println(BROWSER);

            if (BROWSER.equals("chrome")) {
            	String temporaryChromeDriverLocation = "C:\\Practice Automation\\PracticeProject\\src\\main\\resources\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", temporaryChromeDriverLocation);
                driver = new ChromeDriver();
            }

            //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        } catch (IOException | IllegalArgumentException e) {

            throw new IllegalStateException(e);

        }

        return driver;

    }
    
    public void wait(final int milliseconds)
    {
        try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.out.println("Error having a sleep");
		}
    }

    


}
