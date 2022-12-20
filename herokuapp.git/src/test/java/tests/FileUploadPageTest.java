package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.services.FileUploadPageService;

public class FileUploadPageTest extends BaseTest {

    private static final String NAME_OF_FAIL = "Screen.png";

    @Test
        public void verifyNameAddedFileAndNameOnPage (){
        FileUploadPageService fileUploadPageService = new FileUploadPageService();
        fileUploadPageService.uploadFile();
        String actualNameOfFail = NAME_OF_FAIL;
        String expectedNameOfFail = fileUploadPageService.getNameOfAddedFile();
        Assert.assertEquals(actualNameOfFail,expectedNameOfFail, "The actual text of " +
                "the page doesn't match expected");
    }
}
