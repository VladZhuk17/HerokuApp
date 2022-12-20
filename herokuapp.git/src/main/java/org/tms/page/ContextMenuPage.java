package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {

    private static final String CONTEXT_MENU_PAGE_URL = "https://the-internet.herokuapp.com/context_menu";

    @FindBy (xpath = "//div[@id='hot-spot']")
    private WebElement hotSpot;

    public ContextMenuPage openContextMenuPage(){
        driver.get(CONTEXT_MENU_PAGE_URL);
        return this;
    }

    public void contextClickHotSpot(){
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();
    }
}
