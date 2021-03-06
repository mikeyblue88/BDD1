package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Implicit(){
        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();

        WebElement userEmail = driver.findElement(By.id("user_email"));
        userEmail.sendKeys("Test");
    }
    /*
    @Test
    public void explicit(){
        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("useremail")));
        username.sendKeys("Test");

    }
*/
}
