package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
    }
    @Test
    public void Switch() throws InterruptedException {
        String argosHandle = driver.getWindowHandle();
        //System.out.println(argosHandle);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open(arguments[0])","https://www.facebook.com/");
        Thread.sleep(50000);

        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            if(!handle.equals(argosHandle)){
                driver.switchTo().window(handle);
                System.out.println(handle);
                break;
            }
        }

        String facebookHandle = driver.getWindowHandle();

        Thread.sleep(10000);

        driver.switchTo().window(argosHandle);
        Thread.sleep(10000);

        driver.switchTo().window(facebookHandle);
    }
}
