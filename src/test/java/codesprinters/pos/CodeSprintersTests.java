package codesprinters.pos;

import codesprinters.pos.page.CodeSprintersPage;
import codesprinters.pos.page.GooglePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Michal on 30.05.2017.
 */
public class CodeSprintersTests extends TestBase {

    private final String CODE_SPRINTERS = "Code Sprinters";

    @Test
    public void verifyIfGoogleFindsCodeSprinters() throws Exception {

        GooglePage googlePage = new GooglePage(this.driver);

        googlePage.googleFor(
                CODE_SPRINTERS,
                CodeSprintersPage.CODESPRINTERS_PAGE_TITLE);

        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(
                ExpectedConditions.titleIs(
                        CodeSprintersPage.CODESPRINTERS_PAGE_TITLE
                )
        );

        String currentURL = driver.getCurrentUrl();

        Assert.assertTrue(
                currentURL.endsWith(CodeSprintersPage.CODESPRINTERS_URL)
        );
    }

}