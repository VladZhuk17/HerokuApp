package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.driver.DriverSingleton;
import org.tms.services.DynamicControlsPageService;

public class DynamicControlsPageTest extends BaseTest{

    DynamicControlsPageService dynamicControlsPageService;

    @Test
    public void verifyAbsenceOfCheckbox(){
    dynamicControlsPageService = new DynamicControlsPageService();
    WebDriver driver = DriverSingleton.getDriver();
    dynamicControlsPageService.removeCheckbox();
    int actualResult = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
    Assert.assertEquals(actualResult, 0, "The element is on page");
    }

    @Test
    public void verifyInputIsEnable(){
    boolean actualInput = dynamicControlsPageService.enableInput();
    boolean expectedInput = true;
    Assert.assertEquals(actualInput,expectedInput);
    }






}
