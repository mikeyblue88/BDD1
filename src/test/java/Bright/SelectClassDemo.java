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

public class SelectClassDemo {
    public static WebDriver driver;
    @Before
    public void DropDownBox() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void SelectClassDemo() throws InterruptedException {
        WebElement Searchbox = driver.findElement(By.id("searchTerm"));
        Searchbox.sendKeys("Nike");
        WebElement Searchbutton = driver.findElement(By.className("_1gqeQ"));
        Searchbutton.click();
        WebElement Dropdownoption = driver.findElement(By.id("sort-select"));
        Select sel = new Select(Dropdownoption);
        sel.selectByIndex(2);
        Thread.sleep(3000);
        List<WebElement> options = sel.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }


    }
}
