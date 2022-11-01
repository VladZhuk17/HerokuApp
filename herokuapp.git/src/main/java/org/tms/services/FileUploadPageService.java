package org.tms.services;

import org.tms.page.FileUploadPage;

public class FileUploadPageService {

    private String filePath = "C:\\Users\\User\\IdeaProjects\\herokuapp\\herokuapp.git\\src\\main\\resources\\Screen.png";
    private FileUploadPage fileUploadPage = new FileUploadPage();

    public void uploadFile() {
        fileUploadPage.openFileUploadPage();
        fileUploadPage.getXpathOfButtonUpload().sendKeys(filePath);
        fileUploadPage.clickOnButtonUpload();
    }
    public String getNameOfAddedFile(){
        String getNameFailFromPage = fileUploadPage.nameFileFromPage().getText();
        return getNameFailFromPage;
    }
}
