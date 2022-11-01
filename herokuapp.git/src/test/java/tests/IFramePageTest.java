package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.page.IFramePage;
import org.tms.services.IFrameService;

public class IFramePageTest {
    @Test
    public void verifyTextOfParagraphOfIFramePage(){
        IFrameService iFrameService = new IFrameService();
        IFramePage iFramePage = new IFramePage();
        iFrameService.openIFramePage();
        String actualTextOfParagraphOfIFramePage = iFramePage.getTextOfParagraph();
        String expectedTextOfParagraphOfIFramePage = "Your content goes here.";
        Assert.assertEquals(actualTextOfParagraphOfIFramePage,expectedTextOfParagraphOfIFramePage, "The actual " +
         "text of the page doesn't match expected");
    }
}
