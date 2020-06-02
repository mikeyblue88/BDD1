package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArgosRelevance {
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
    public void Argos(){
        WebElement Searchbox = driver.findElement(By.id("searchTerm"));
        Searchbox.sendKeys("NIKE");

        WebElement Searchbutton = driver.findElement(By.className("_1gqeQ"));
        Searchbutton.click();

        WebElement Dropdownbox = driver.findElement(By.id("sort-select"));
        Select sel = new Select(Dropdownbox);
        sel.selectByValue("price_desc");

        List<WebElement> prices = driver.findElements(By.cssSelector(".ProductCardstyles__PriceContainer-l8f8q8-13.lcxskn"));

        for (WebElement price : prices){
            System.out.println(price.getText());
            if(price.getText().contains("£529.00")){
                price.click();
            }
        }
    }
}
