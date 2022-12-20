package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.driver.DriverSingleton;

public class IFramePage {

    private WebDriver driver = DriverSingleton.getDriver();

    @FindBy(xpath = "html/body[@id='tinymce']")
    private WebElement textOfParagraph;

    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    private WebElement iframeElement;

    public String getTextOfParagraph(){
        driver.switchTo().frame(iframeElement);
        textOfParagraph.click();
        String textFromParagraph = textOfParagraph.getText();
        return textFromParagraph;
    }
}
/*
driver.switchTo().frame(frameId);
        driver.findElement(textToCheck).click();
        String actualText = driver.findElement(textToCheck).getText();
        Assert.assertEquals(actualText,expectedText);
*/