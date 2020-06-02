package Bright;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class BrowserInvoked {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        //find searchbox element by id
        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("NIKE");//used sendKeys method to type word NIKE

        //click the search button
        //WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        //searchbutton.click();

        //find searchbox elemnet by css selector
        //WebElement searchbutton = driver.findElement(By.cssSelector("#searchTerm"));
        //searchbutton.sendKeys("Nike");

        //performed searchbox element by class name
        //WebElement searbox = driver.findElement(By.className("_1Rz0y"));
        //"searbox.sendKeys("NIKE");

        //performed searchbox element by xpath
        //WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"searchTerm\"]"));
        //searchbox.sendKeys("NIKE");

        //click wishlist button via linktext
        //WebElement wishlistButton = driver.findElement(By.linkText("Wishlist"));
        //wishlistButton.click();
    }
}
