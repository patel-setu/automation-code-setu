package io.angular.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.angular.pages.FilebinPages;

public class MyStepdefs2 {
    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String arg0) {

    }

    @When("^I upload word document$")
    public void iUploadWordDocument() {
        new FilebinPages().selectFileLocation();
    }

    @Then("^document should be uploaded$")
    public void documentShouldBeUploaded() {
    }
}
