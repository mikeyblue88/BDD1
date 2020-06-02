package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionDemo {public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk");
        driver.manage().window().maximize();
    }

    @Test
    public void argos(){
        String actual = driver.getCurrentUrl();

        //Assert.assertThat(actual, Matchers.equalToIgnoringCase("https://www.argos.co.uk/"));
        //Assert.assertThat(actual, Matchers.endsWith("argos.co.uk"));
        //Assert.assertThat(actual, Matchers.containsString("https//www.argos.co.uk/"));
        //Assert.assertThat(actual, Matchers.greaterThan("9.00"));
        //Assert.assertThat(actual, Matchers.lessThanOrEqualTo("9.00"));

    }

}
