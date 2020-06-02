package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArgosStar {
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
    public void starRating(){
        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("NIKE");

        WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();

        List<WebElement> radiobuttons = driver.findElements(By.cssSelector(".RadioListstyles__Label-sc-4132xt-5.gywEET"));
        for (WebElement radiobutton : radiobuttons) {
            System.out.println(radiobutton.getAttribute("id"));

        if (radiobutton.getAttribute("id").contains("4 or more-label")){
            radiobutton.click();
        }
        }
    }
}
