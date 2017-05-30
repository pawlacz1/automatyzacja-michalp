package codesprinters.pos.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Michal on 30.05.2017.
 */
public class GooglePage extends PageObject {

    public final static String GOOGLE_URL = "http://www.google.com";

    // Points of Interests
    private final By searchField = By.name("q");
    // -------------------

    public GooglePage(WebDriver drv) {
        super(drv);
    }

    public void goToGoogle() {
        driver.get(GOOGLE_URL);
    }

    public void searchOnGoogle(String query) {
        WebElement googleSearchBox = driver.findElement(searchField);
        googleSearchBox.sendKeys(query);
        googleSearchBox.sendKeys(Keys.ENTER);
    }

    public void clickOnResultContaining(String pattern) {
        WebElement element = driver.findElement(
                resultWithPattern(pattern)
        );
        element.click();
    }

    public void googleFor(String what, String where) {
        this.goToGoogle();
        this.searchOnGoogle(what);
        this.clickOnResultContaining(where);
    }

    // private

    private By resultWithPattern(String pattern) {
        return By.xpath("//a[text()='" + pattern + "']");
    }
}