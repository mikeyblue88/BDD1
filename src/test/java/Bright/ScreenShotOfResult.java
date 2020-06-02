package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotOfResult {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void result() throws InterruptedException {
        WebElement loginbutton = driver.findElement(By.id("u_0_b"));
        loginbutton.click();
        Thread.sleep(3000);//very important, without it, it may take homepage screenshot
    }
    @After
    public void teardown() throws IOException {

        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile = new File("C:\\Users\\mikey\\OneDrive\\Desktop\\ScreenShotFile\\Screenshot.png");
        FileUtils.copyFile(sourcefile,destinationfile);
    }
}
