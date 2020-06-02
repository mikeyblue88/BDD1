package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Switchiframe {
    public static WebDriver driver;
    @Before
    public void DropDownBox() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
    @Test
    public void iFrame() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().frame("courses-iframe");

        WebElement searchCourse = driver.findElement(By.id("search-courses"));
        searchCourse.sendKeys("java");

        driver.switchTo().defaultContent();
        WebElement bmwradio = driver.findElement(By.id("bmwradio"));
        bmwradio.click();
    }
}
