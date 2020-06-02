package Bright;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TescoClubcardSignup {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://secure.tesco.com/Clubcard");
        driver.manage().window().maximize();
    }
    @Test
    public void register() throws InterruptedException {
        WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
        signIn.click();
        WebElement registerForAccount = driver.findElement(By.cssSelector(".register-cta__link"));
        registerForAccount.click();
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("gambling4mikey@gmail.com");
        email.sendKeys(Keys.TAB);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("28072013Ems!");
        WebElement dropdownoption = driver.findElement(By.id("title"));
        Select sel = new Select(dropdownoption);
        sel.selectByValue("Mr");
        dropdownoption.sendKeys(Keys.TAB);
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Michael");
        firstName.sendKeys(Keys.TAB);
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sullivan");
        lastName.sendKeys(Keys.TAB);
        WebElement phoneNumber = driver.findElement(By.id("phone-number"));
        phoneNumber.sendKeys("07539682926");
        phoneNumber.sendKeys(Keys.TAB);
        WebElement postCode = driver.findElement(By.id("postcode"));
        postCode.sendKeys("RM9 6TJ");
        Thread.sleep(10000);
        WebElement findAddress = driver.findElement(By.cssSelector("div.ui-component__grid div.mytesco-container div.main.register.false div.ui-component__panel div.form-container form.register-form:nth-child(1) fieldset.fieldset.address-field-set:nth-child(5) div.address > button.ui-component__button:nth-child(3)"));
        findAddress.click();
        Thread.sleep(10000);
        WebElement dropdownoption1 = driver.findElement(By.id("address-dropdown"));
        Select sel1 = new Select(dropdownoption1);
        sel1.selectByValue("3 Arden Crescent");
        WebElement marketingBox1 = driver.findElement(By.xpath("//div[@class='marketing-preferences__checkbox-multi']//div[2]//div[1]//label[1]//span[1]//span[1]"));
        marketingBox1.click();
        WebElement marketingBox2 = driver.findElement(By.xpath("//div[3]//div[1]//label[1]//span[1]//span[1]"));
        marketingBox1.click();
        WebElement marketingBox3 = driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[1]//span[1]"));
        marketingBox1.click();
        Thread.sleep(10000);

    }
}
