import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import demo.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest {

  private static WebDriver driver;

  @Test
  public void testCase1_AddNewOwner() {
		Owner owner = new Owner();
		owner.launchSite();
		owner.addOwner();
	}

  @Test
	public void testCase2_AddNewPet() {
		Pet pet = new Pet();
		pet.addPet();
	}

  @Test
	public void testCase3_SearchOwner() {
		Owner owner = new Owner();
		owner.searchOwner();
	}

  @Test
  public void testCase4_CloseBrowser() {
		WebDriver chromeDriver = WebDriverUtil.getDriver();
		chromeDriver.quit();
	}

}
