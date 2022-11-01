package org.tms.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.tms.driver.DriverSingleton;
import org.tms.page.DynamicControlsPage;

public class DynamicControlsPageService {

    private WebDriver driver = DriverSingleton.getDriver();
    private DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();

    public DynamicControlsPage removeCheckbox() {
        dynamicControlsPage.openDynamicControlsPage()
                .clickOnCheckbox()
                .clickOnButtonRemove()
                .waitForTextItGone();
        return new DynamicControlsPage();
    }

    public boolean enableInput() {
        dynamicControlsPage.openDynamicControlsPage()
                .writeTextInInput();
        boolean inputIsEnabled = true;
        if (inputIsEnabled != driver.findElements((By) dynamicControlsPage.getXpathInputField()).isEmpty()) {
            return false;
        }
        return true;
    }
}


/*  if (buttonIsEnabled != driver.findElements((By) dynamicControlsPage.getButtonEnable().
            dynamicControlsPage.clickButtonEnable()
                    .waitForTextItEnable();
            return true;
        } else {
            return false;
        }

        List<String> listStr*/



/*public boolean enableInput() {
        dynamicControlsPage.openDynamicControlsPage()
                .writeTextInInput();
        boolean inputIsEnabled = true;
        if (inputIsEnabled != driver.findElements((By) dynamicControlsPage.getButtonEnable()).isEmpty()) {
            return false;
        }
        return true;
    }*/