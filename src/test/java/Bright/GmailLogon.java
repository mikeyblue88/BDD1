package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GmailLogon {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https//www.google.co.uk");
        driver.manage().window().maximize();
    }
    @Test
    public void gmail(){
        WebElement googleSearchbox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        googleSearchbox.sendKeys("Gmail");

        WebElement googleSearchbutton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
        googleSearchbutton.click();

        WebElement closeList = driver.findElement(By.cssSelector("body.srp.tbo.vasq:nth-child(2) div.big:nth-child(7) form.tsf.nj div.A8SBwf:nth-child(1) div.RNNXgb div.SDkEP div.dRYYxd div.clear-button.XoaYSb span.lBbtTb.z1asCe.rzyADb > svg:nth-child(1)"));
        closeList.click();

        //WebElement gmailWebpage = driver.findElement(By.xpath("//h3[contains(text(),'Gmail - Google')]"));
        //gmailWebpage.click();

}}

