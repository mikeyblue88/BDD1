package Bright;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalenderExample {
    public static WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mikey\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.expedia.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void allDates() {

        WebElement departingfield = driver.findElement(By.id("deptdt"));
        departingfield.click();

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : alldates) {
            System.out.println(date.getText());
            date.click();

            if (date.getText().equals("6")) {
                date.click();
            }
        }
    }
    @Test
public void expedia(){
    WebElement flights = driver.findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[1]/span"));
    flights.click();

    WebElement departuremonth = driver.findElement(By.xpath("//div[@id='flight-departing-wrapper-hp-flight']//span[contains(text(),'Departing')]"));
    departuremonth.click();

    WebElement Maycalendermonth = driver.findElement(By.xpath("//div[@id='flight-departing-wrapper-hp-flight']//div[2]"));
    System.out.println(Maycalendermonth.isDisplayed());
    List<WebElement> alldates = Maycalendermonth.findElements(By.cssSelector(".datepicker-cal-date"));

        for (WebElement alldate : alldates) {
            System.out.println(alldate.getText());

            if (alldate.getText().contains("15")){
                alldate.click();

            }
        }
    }
}
