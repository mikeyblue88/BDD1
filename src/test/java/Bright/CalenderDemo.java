package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderDemo {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.opodo.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void departure(){
        WebElement departures = driver.findElement(By.xpath("//body/div/div/div/div/section/div/div/div/div/div/div/div/div/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
        departures.click();

        WebElement MayCalenderMonth = driver.findElement(By.xpath("//body/div/div/div/div/section/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[2]"));
        System.out.println(MayCalenderMonth.isDisplayed());
        List<WebElement> alldates = MayCalenderMonth.findElements(By.cssSelector(".od-ui-calendar-day"));

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());

            if(alldate.getText().contains("10")){
                alldate.click();
            }

        }

    }
}
