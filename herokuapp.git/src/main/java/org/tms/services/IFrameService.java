package org.tms.services;

import org.tms.page.FramesPage;
import org.tms.page.IFramePage;

public class IFrameService {

    private static final String FRAMES_PAGE_URL = "https://the-internet.herokuapp.com/frames";
    private IFramePage iFramePage;

    public IFramePage openIFramePage(){
        FramesPage framesPage = new FramesPage();
        framesPage.openFramesPage(FRAMES_PAGE_URL)
                  .clickOnLinkOfIFrame();
        return new IFramePage();
    }
}
