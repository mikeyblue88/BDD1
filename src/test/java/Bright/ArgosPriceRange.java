package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ArgosPriceRange {

    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
}

        @Test
        public void fiveRadioButton(){
        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("NIKE");

        WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();

        WebElement fiveRadioButton = driver.findElement(By.xpath("//span[contains(text(),'£5 - £10')]"));
        fiveRadioButton.click();}}