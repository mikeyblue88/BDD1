package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Interview1605 {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.britishairways.com/en-gb/flights-and-holidays/flights");
        driver.manage().window().maximize();
    }
    @Test
    public void britishAirways() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement mouseHover = driver.findElement(By.linkText("Book"));

        action.moveToElement(mouseHover).perform();
        Thread.sleep(3000);
        WebElement bookAFlight = driver.findElement(By.linkText("Book a flight"));
        action.moveToElement(bookAFlight).click().perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(3000);

        WebElement usa = driver.findElement(By.id("depCountry"));
        Select sel = new Select(usa);
        sel.selectByValue("US");

        WebElement addReturn = driver.findElement(By.xpath("//div[@class='date add-date h1 ng-scope']//span"));
        addReturn.click();

        List<WebElement> dates = driver.findElements(By.cssSelector(".day-wrapper.bold.ng-scope"));
        for (WebElement date : dates){
            System.out.println(date.getText());
            if (date.getText().contains("18")){
                date.click();
            }
        }
    }
}
