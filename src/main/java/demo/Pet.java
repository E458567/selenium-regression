package demo;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pet {

	public void addPet() {

		WebDriver driver = WebDriverUtil.getDriver();
		//Click add new Owner
		WebElement addNewPetEle = driver.findElement(By.xpath("/html/body/div/div/a[2]"));
		addNewPetEle.click();

		WebElement nameEle = driver.findElement(By.id("name"));
		nameEle.sendKeys(RandomStringUtils.randomAlphabetic(5));

		WebElement birthDateEle = driver.findElement(By.id("birthDate"));
		birthDateEle.sendKeys("2018-01-01");

		Select typeEle = new Select(driver.findElement(By.id("type")));
		typeEle.selectByIndex((new Random()).nextInt(5));

		WebElement addPetBtn = driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div/button"));
		addPetBtn.click();

	}
}
