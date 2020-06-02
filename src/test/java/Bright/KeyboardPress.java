package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class KeyboardPress {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }

    @Test
    public void keyPress(){
        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();

        WebElement username = driver.findElement(By.id("user_email"));
        username.sendKeys("mike@yahoo.co.uk");
        username.sendKeys(Keys.TAB);

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("12345678");
        password.sendKeys(Keys.ENTER);
    }
    @Test
    public void combineKeyPress() throws InterruptedException {
        WebElement bmwradio = driver.findElement(By.id("bmwradio"));
        bmwradio.click();

        bmwradio.sendKeys(Keys.CONTROL+"a", Keys.CONTROL+"c");
        Thread.sleep(10000);

        WebElement nameBox = driver.findElement(By.id("name"));
        nameBox.click();
        nameBox.sendKeys(Keys.CONTROL+"v");
    }
}
