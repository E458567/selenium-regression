package demo;

import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
        try {
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            String dockerUrl = System.getenv("DOCKER_URL");
            if (dockerUrl == null) {
                driver = new FirefoxDriver();
            } else {
                System.out.println("Connecting to remote docker: " + dockerUrl);
                driver = new RemoteWebDriver(new URL(dockerUrl), DesiredCapabilities.firefox()); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return driver;
	}
}
