package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.ContextMenuPageService;

public class ContextMenuPageTest extends BaseTest {

    @Test
    public void verifyClosingOfAlertTest(){
        ContextMenuPageService contextMenuPageService = new ContextMenuPageService();
        contextMenuPageService.rightClickOnInBox();
        String actualTextOfMessageOfAlert = contextMenuPageService.getTextOfMessageOfAlert();
        String expectedTextOfMessageOfAlert="You selected a context menu";
        Assert.assertEquals(actualTextOfMessageOfAlert, expectedTextOfMessageOfAlert,"The actual text of " +
                "the page doesn't match expected");
        }
}
