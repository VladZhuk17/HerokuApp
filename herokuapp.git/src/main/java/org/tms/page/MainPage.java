package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
    @FindBy(xpath = "//a[text()='Context Menu']")
    private WebElement contextMenu;

    @FindBy(xpath = "//a[text()='Dynamic Controls']")
    private WebElement dynamicControls;

    @FindBy(xpath = "//a[text()='File Upload']")
    private WebElement fileUpload;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement frames;

}
