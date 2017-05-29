package codesprinters.test01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017-05-29.
 */
public class BasicTest {

    @Test
    public void veryfyIfGoogleFindsCodeSprinters()throws Exception {
        System.setProperty(
                "webdriver.gecko.driver",
                "C:\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait( 3000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.google.com");

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Code Sprinters");
        googleSearchBox.sendKeys(Keys.ENTER);

        WebElement codeSprinters = driver.findElement(By.xpath("//a[text()='Code Sprinters -']"));
        codeSprinters.click();

        Thread.sleep(5000);

        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "http://agileszkolenia.pl/");

        if (driver!= null){
            driver.quit();
        }
    }
    }
