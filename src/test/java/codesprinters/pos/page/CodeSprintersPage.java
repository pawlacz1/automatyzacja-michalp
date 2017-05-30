

package codesprinters.pos.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by Michal on 30.05.2017.
 */
public class CodeSprintersPage extends PageObject {

    public static final String CODESPRINTERS_URL = "facebook.com/CodeSprinters/";
    public static final String CODESPRINTERS_PAGE_TITLE = "Code Sprinters - Strona główna | Facebook";

    public CodeSprintersPage(WebDriver drv) {
        super(drv);
    }
}
