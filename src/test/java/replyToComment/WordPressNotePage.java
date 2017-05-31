package replyToComment;

import codesprinters.pos.page.CodeSprintersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017-05-31.
 */
public class WordPressNotePage extends PageObject{
    private By Reply;

    public WordPressNotePage(WebDriver drv) {
        super(drv);
    }

    public void replyToComment(String text) {
        Reply = By.xpath("//article[.//p[text()='" + text + "']]//a[@class='comment-reply-link']");
        WebElement comment = findComment();
        comment.click();
//wait

    }
    public void displayOldComments(){

        By displayOldCommentsLinkSelector = By.cssSelector(".navigation-comment > .nav-previous > a");
        driver.findElement(displayOldCommentsLinkSelector).click();
        WaitForElementClickable(displayOldCommentsLinkSelector);

    }
    public WebElement findComment(){

        while (isElementNotPresent(Reply)){
            displayOldComments();
        }
        return driver.findElement(Reply);
    }


}
