package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatePages {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void test1(){
        //how to get the website title
        String CurrentTitle = driver.getTitle();
        System.out.println(CurrentTitle);
        //how to print the url
        String CurrentURL = driver.getCurrentUrl();
        System.out.println(CurrentURL);
        //how to navigate to a different webpage
        driver.navigate().to("https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1");
        String NavigatedUrl = driver.getCurrentUrl();
        System.out.println(NavigatedUrl);
        //how to move the webpage back
        driver.navigate().back();
        //how to move the webpage forward
        driver.navigate().forward();
    }
}
