package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {

    @FindBy(xpath = "//a[@href='/iframe']")
    private WebElement linkOfIFrame;

    public FramesPage openFramesPage(String url){
        driver.get(url);
        return this;
    }

    public void clickOnLinkOfIFrame(){
        linkOfIFrame.click();
    }
}
