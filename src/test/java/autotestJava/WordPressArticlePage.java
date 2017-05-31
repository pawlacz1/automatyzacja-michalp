package autotestJava;

import codesprinters.pos.page.CodeSprintersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

/**
 * Created by Administrator on 2017-05-30.
 */
public class WordPressArticlePage extends PageObject {

    //1 by
    private final By LeaveAReply = By.id("comment");
    private final By Email = By.id("email");
    private final By Name = By.id("author");
    private final By SendPost = By.id("comment-submit");
    private final String author = UUID.randomUUID().toString();

    public WordPressArticlePage(WebDriver drv) {
        super(drv);
    }

    public void addCommentToNote(String note, String email, String name) {
        //poczekac na Leave a Reply


        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(LeaveAReply)
        );
    }
        //kliknac na L a R
    public void clickOnLeaveAReply() throws InterruptedException {
        WebElement element = driver.findElement(LeaveAReply);

        element.click();
        // poczekac na pozostale elementy
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(Email)
        );
         WebDriverWait waitN = new WebDriverWait(driver, 20);

        wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(Name)
        );
        // sendKeys 1 2 3
        WebElement leaveAReply = driver.findElement(LeaveAReply);
        leaveAReply.sendKeys(author);
        leaveAReply.sendKeys(Keys.TAB);

        WebElement email = driver.findElement(Email);
        email.sendKeys("pawla@poczta.onet.pl");
        email.sendKeys(Keys.TAB);

        WebElement name = driver.findElement(Name);
        name.sendKeys("Michal");
        name.sendKeys(Keys.TAB);
        Thread.sleep(5000);
        // kliknac send post

        WebElement elementS = driver.findElement(SendPost);

        elementS.click();
    }
}
