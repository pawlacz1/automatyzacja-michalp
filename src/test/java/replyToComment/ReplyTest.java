package replyToComment;


import org.junit.Test;

/**
 * Created by Administrator on 2017-05-31.
 */
public class ReplyTest extends TestBase{

    @Test
    public void replyToComment() throws InterruptedException {

        WordPressHomePage wordPressHomePage = new WordPressHomePage(this.driver);
        wordPressHomePage.goToWordPress();
        wordPressHomePage.goToThirdNote();
        WordPressNotePage wordPressNotePage = new WordPressNotePage(this.driver);
        wordPressNotePage.replyToComment("ce3b8982-8194-44ab-b606-0cdddd42f955");

        /*WordPressArticlePage wordPressArticlePage = new WordPressArticlePage(this.driver);
        wordPressArticlePage.clickOnLeaveAReply();*/
        Thread.sleep(5000);
    }
}

