package io.angular.pages;

import io.angular.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilebinPages extends Utility {
    private static final Logger log = LogManager.getLogger(DocumentPages.class.getName());

    public FilebinPages() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "fileField")
    WebElement selectFileBtn;

    public void selectFileLocation() {
        //clickOnElement(selectFileBtn);
        selectFileBtn.sendKeys("/Users/44794/OneDrive/Test_Document.docx");
    }
}
