package autotestJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2017-05-30.
 */
public class WordPressHomePage extends PageObject {

    public final static String WORDPRESSURL = "https://autotestjava.wordpress.com/";

    private final By addcomment = By.xpath("(//span[@class='comments-link'])[3]");



    public WordPressHomePage(WebDriver drv) {
        super(drv);
    }

    public void goToWordPress () {
        driver.get(WORDPRESSURL);
    }

    public void goToThirdNote() {
        WebElement openside = driver.findElement(addcomment);
        openside.click();
    }
}