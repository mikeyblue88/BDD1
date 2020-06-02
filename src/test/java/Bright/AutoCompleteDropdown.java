package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoCompleteDropdown {
    public static WebDriver driver;
    @Before
    public void setup(){
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.expedia.co.uk/Hotels");
        driver.manage().window().maximize();
    }
    @Test
public void expeida() throws InterruptedException {
        WebElement DestinationBox = driver.findElement(By.id("hotel-destination-hlp"));
        System.out.println(DestinationBox.isEnabled());
        DestinationBox.sendKeys("Del");
        Thread.sleep(5000);


        List<WebElement> Destinations = driver.findElements(By.cssSelector(".multiLineDisplay.details"));
        for (WebElement Destination : Destinations) {
            System.out.println(Destination.getText());

            if(Destination.getText().contains("Delhi (DEL - Indira Gandhi Intl.)"));
            Destination.click();
            break;
        }
    }
    //@After
    //public void teardown(){
        //driver.quit();
    //}
}
