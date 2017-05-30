package codesprinters.pos.page;

import org.openqa.selenium.WebDriver;

/**
 * Created by Michal on 30.05.2017.
 */
public abstract class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver drv) {
        this.driver = drv;
    }

}