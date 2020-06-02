package Bright;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArgosCheckBoxDemo {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void argosPriceRange() throws InterruptedException {

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("NIKE");

        WebElement clickbox = driver.findElement(By.className("_1gqeQ"));
        clickbox.click();

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("label[name=price]"));
        for (WebElement checkbox :checkboxes) {
            System.out.println(checkbox.getAttribute("Value"));

            if(checkbox.getAttribute("Value").contains("£10 - £15")){
            checkbox.click();

        }
    }
}
}


