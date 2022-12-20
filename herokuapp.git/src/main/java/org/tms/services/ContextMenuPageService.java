package org.tms.services;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;
import org.tms.page.ContextMenuPage;
import java.time.Duration;

public class ContextMenuPageService {


    private WebDriver driver = DriverSingleton.getDriver();
    private ContextMenuPage contextMenuPage;
    private WebDriverWait wait;

    public void rightClickOnInBox() {
        contextMenuPage = new ContextMenuPage();
        contextMenuPage.openContextMenuPage();
        contextMenuPage.contextClickHotSpot();
    }

    public String getTextOfMessageOfAlert() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String actualTextOfMessageOfAlert = alert.getText();
        alert.accept();
        return actualTextOfMessageOfAlert;
    }
}
