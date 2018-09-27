package demo;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Owner {

	public void launchSite() {
		WebDriver chromeDriver = WebDriverUtil.getDriver();
		//String url = "http://localhost:8090";
        String url = System.getenv("SAMPLE_APP_URL");
		chromeDriver.navigate().to(url);
	}

	public void addOwner() {

		WebDriver driver = WebDriverUtil.getDriver();

		//Find Owner
		WebElement findOwnerEle = driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a/span[2]"));
		findOwnerEle.click();

		//Add new owner
		WebElement addOwnerEle = driver.findElement(By.xpath("/html/body/div/div/a"));
		addOwnerEle.click();

		//Enter info
		WebElement firstNameEle = driver.findElement(By.id("firstName"));
		firstNameEle.sendKeys(RandomStringUtils.randomAlphabetic(3));

		WebElement lastNameEle = driver.findElement(By.id("lastName"));
		lastNameEle.sendKeys("Sue");

		WebElement addressEle = driver.findElement(By.id("address"));
		addressEle.sendKeys("Here");

		WebElement cityEle = driver.findElement(By.id("city"));
		cityEle.sendKeys("Quincy");

		WebElement telephoneEle = driver.findElement(By.id("telephone"));
		telephoneEle.sendKeys(String.valueOf((new Random()).nextInt(100000000)));

		WebElement addOwnerBtn = driver.findElement(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button"));
		addOwnerBtn.click();

	}



	public void searchOwner() {
		WebDriver driver = WebDriverUtil.getDriver();

		//Find Owner
		WebElement findOwnersEle = driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a/span[2]"));
		findOwnersEle.click();

		WebElement lastNameEle = driver.findElement(By.id("lastName"));
		lastNameEle.sendKeys("Sue");

		WebElement findOwnerEle = driver.findElement(By.xpath("//*[@id=\"search-owner-form\"]/div[2]/div/button"));
		findOwnerEle.click();
	}
}
