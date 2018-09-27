package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			return getFirefoxDriver();
		}else {
			return driver;
		}
	}

	public static WebDriver getFirefoxDriver() {
    System.setProperty("webdriver.gecko.driver", "geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
}
