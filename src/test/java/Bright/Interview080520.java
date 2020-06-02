package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Interview080520 {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.traveltrolley.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void traveltrolley() throws InterruptedException {
        WebElement departuredate = driver.findElement(By.id("StartDate"));
        departuredate.click();

        WebElement Dropdownoption = driver.findElement(By.className("ui-datepicker-month"));
        Select sel = new Select(Dropdownoption);
        sel.selectByValue("7");
        Thread.sleep(4000);

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement alldate : alldates){
            System.out.println(alldate.getText());

            if(alldate.getText().contains("4")){
                alldate.click();
                break;
            }
        }
            
        }
    }
















