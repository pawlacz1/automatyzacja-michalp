package autotestJava;

import org.junit.Test;

/**
 * Created by Administrator on 2017-05-30.
 */
public class WordPressTest extends TestBase{

    @Test
    public void goToArticlePage() throws Exception {

        WordPressHomePage wordPressHomePage = new WordPressHomePage(this.driver);
        wordPressHomePage.goToWordPress();
        wordPressHomePage.goToThirdNote();

        WordPressArticlePage wordPressArticlePage = new WordPressArticlePage(this.driver);
        wordPressArticlePage.clickOnLeaveAReply();
        Thread.sleep(5000);
    }
}
