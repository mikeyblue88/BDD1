package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Interview {

    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.iceland.co.uk/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void Iceland(){
        WebElement searchbox = driver.findElement(By.id("header-search"));
        searchbox.sendKeys("Crisp");

        WebElement magnifier = driver.findElement(By.xpath("//form[@name='simpleSearch']//div//div//button//*[local-name()='svg']"));
        magnifier.click();

        WebElement range = driver.findElement(By.id("-0000000001"));
        range.click();





    }
}
