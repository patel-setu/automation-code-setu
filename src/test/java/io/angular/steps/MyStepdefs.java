package io.angular.steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import resources.featurefile.angular.pages.DocumentPage;
import resources.featurefile.angular.pages.FeaturesPage;
import resources.featurefile.angular.pages.HomePage;
import org.junit.Assert;

import java.util.List;

public class MyStepdefs {


    @Given("^I navigate to angular website$")
    public void iNavigateToAngularWebsite() {
    }

    @And("^I click the FEATURES button$")
    public void iClickTheFEATURESButton() {
        new HomePage().clickOnfeatureButton();
    }


    @Then("^the text FEATURES & BENEFITS is displayed$")
    public void theTextFEATURESBENEFITSIsDisplayed() {
        String expectedMessage = "FEATURES & BENEFITS";
        String actualMessage = new HomePage().getFeatureAndBenefitsText();
        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
    }

    @And("^the section Cross Platform is displayed$")
    public void theSectionCrossPlatformIsDisplayed() {
        String expectedMessage = "CROSS PLATFORM";
        String actualMessage = new FeaturesPage().getAndverifyCrossPlatformtext();
        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
    }

    @And("^the section Speed and Performance is displayed$")
    public void theSectionSpeedAndPerformanceIsDisplayed() {
        String expectedMessage = "SPEED AND PERFORMANCE";
        String actualMessage = new FeaturesPage().getAndverifySpeedAndPerformancetext();
        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);

    }

    @And("^the section Productivity is displayed$")
    public void theSectionProductivityIsDisplayed() {
        String expectedMessage = "PRODUCTIVITY";
        String actualMessage = new FeaturesPage().getAndverifyProductivitytext();
        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
    }

    @And("^the section texts are displayed$")
    public void theSectionTextsAreDisplayed(DataTable table) {
        List<List<String>> data = table.raw();
        for(int i = 1;i<data.size();i++){


        }
//        String expectedMessage = "CROSS PLATFORM";
//        String actualMessage = new FeatureAndBenefitsPage().getAndverifyCrossPlatformtext();
//        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
//
//        String expectedMessage1 = "SPEED AND PERFORMANCE";
//        String actualMessage1 = new FeatureAndBenefitsPage().getAndverifySpeedAndPerformancetext();
//        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
//
//        String expectedMessage2 = "PRODUCTIVITY";
//        String actualMessage2 = new FeatureAndBenefitsPage().getAndverifyProductivitytext();
//        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
    }

    @And("^I click the DOCS button$")
    public void iClickTheDOCSButton() {
        new DocumentPage().clickOnDocsButton();
    }

    @Then("^the text Introduction to the Angular Docs is displayed$")
    public void theTextIntroductionToTheAngularDocsIsDisplayed() {
        String expectedMessage = "Introduction to the Angular Docs";
        String actualMessage = new DocumentPage().getIntroductiontotheAngularDocsText();
        Assert.assertEquals("Text not displayed", expectedMessage, actualMessage);
    }




}
