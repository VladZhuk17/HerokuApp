package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    private static final String FILE_UPLOAD_PAGE_URL = "http://the-internet.herokuapp.com/upload";

    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement buttonFileUpload;

    @FindBy(xpath = "//input[@id='file-submit']")
    private WebElement buttonUpload;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement nameFileOnPage;

    public WebElement getXpathOfButtonUpload() {
        return buttonUpload;
    }

    public WebElement nameFileFromPage() {
        return nameFileOnPage;
    }

    public FileUploadPage openFileUploadPage() {
        driver.get(FILE_UPLOAD_PAGE_URL);
        return this;
    }

    public FileUploadPage clickOnButtonUpload() {
        buttonUpload.click();
        return this;
    }
}
