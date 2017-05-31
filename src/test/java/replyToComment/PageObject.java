package replyToComment;

import codesprinters.pos.page.CodeSprintersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Michal on 30.05.2017.
 */
public abstract class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver drv) {
        this.driver = drv;
    }

    protected boolean isElementNotPresent(By locator){
        try {
            driver.findElement(locator);
            return false;
        } catch (org.openqa.selenium.NoSuchElementException exc){
            return true;
        }

    }

    protected void WaitForElementClickable(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(selector));
    }

}