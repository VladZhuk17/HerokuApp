package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage extends BasePage {


    private static final String DYNAMIC_CONTROL_PAGE_URL = "https://the-internet.herokuapp.com/dynamic_controls";
    private static final int WAIT_TIMEOUT_SECONDS = 5;
    private String textForWriting = "asdasdasd";

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement buttonRemove;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputEnableOrDisable;

    @FindBy(xpath = "//button[text()='Enable']")
    private WebElement buttonEnable;

    @FindBy(xpath = "//form[@id='checkbox-example']/p[contains(text(),gone)]")
    private WebElement textItGone;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputField;

    @FindBy(xpath = "//p[contains(text(),'enabled')]")
    private WebElement textItEnabled;

    @FindBy(xpath = "//p[contains(text(),'disabled')]")
    private WebElement textItDisabled;

    public WebElement getXpathInputField() {
        return inputField;
    }

    public DynamicControlsPage openDynamicControlsPage() {
        driver.get(DYNAMIC_CONTROL_PAGE_URL);
        return this;
    }

    public DynamicControlsPage clickOnCheckbox() {
        checkbox.click();
        return this;
    }

    public DynamicControlsPage clickOnButtonRemove() {
        buttonRemove.click();
        return this;
    }

    public DynamicControlsPage waitForTextItGone() {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.visibilityOf(textItGone));
        return this;
    }

    public DynamicControlsPage clickButtonEnable() {
        buttonEnable.click();
        return this;
    }

    public DynamicControlsPage waitForTextItEnable() {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS)).until(ExpectedConditions.visibilityOf(textItEnabled));
        return this;
    }

    public DynamicControlsPage clickOnInput(){
        inputField.click();
        return this;
    }

    public DynamicControlsPage writeTextInInput() {
        inputField.clear();
        inputField.sendKeys(textForWriting);
        return this;
    }
}
