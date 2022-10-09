package resources.featurefile.angular.pages;

import resources.featurefile.angular.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.featurefile.angular.drivermanager.ManageDriver;

public class FileBinPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public FileBinPage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//input[@id='fileField']")
    WebElement chooseFile;

    public void sendFileLocation() throws InterruptedException {
        mouseHoverToElementAndClick(chooseFile);
        chooseFile.sendKeys("Users/44794/OneDrive/Test_Document.docx");
       // Thread.sleep(1000);
    }


}


