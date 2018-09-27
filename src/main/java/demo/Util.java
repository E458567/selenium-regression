package demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Util {

    public static void screenshot() {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) WebDriverUtil.getDriver();
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            String savePath = "screenshots/" + "screen-" + System.currentTimeMillis() + ".png";
            System.out.println(savePath);
            FileUtils.copyFile(src, new File(savePath));
            System.out.println("screenshot has been saved to " + savePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
