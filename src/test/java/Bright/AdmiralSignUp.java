package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class AdmiralSignUp {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.admiral.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void admiralApplication() throws InterruptedException {
        WebElement cookies = driver.findElement(By.cssSelector(".button.button--midi.button--aqua.cookie-accept"));
        cookies.click();
        WebElement multiCover = driver.findElement(By.linkText("Multi Cover"));
        multiCover.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,750);");
        Thread.sleep(5000);
        WebElement getQuote = driver.findElement(By.cssSelector("body.node.admiral_page.id7:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(4) div.wrapper.bg-hero.hero-banner.hero-banner--A.hero-banner--center-mobile:nth-child(1) div.container div.hero-banner__copy:nth-child(4) div.buttons > a.button.button--hero.button--green"));
        getQuote.click();
    }
        }

