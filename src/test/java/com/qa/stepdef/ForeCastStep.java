package com.qa.stepdef;

import com.qa.actions.ForcastActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ForeCastStep {

    @Given("^The user have proper API key$")
    public void theUserHaveProperAPIKey() {

    }

    @When("^I look up for the weather forecast for next 16 days with postal code \"([^\"]*)\"$")
    public void theUserSentsGETRequestAndGetTheTimestampAndWeatherValue(String postCode) {
        ForcastActions.requestForecastWithGet(postCode);
    }

    @Then("^API response should return status as \"([^\"]*)\"$")
    public void apiResponseShouldReturnStatusAs(int value) {
        assertThat("Verify Status code for Weather Api ", ForcastActions.getStatusCode(), equalTo(value));
        Assert.assertEquals("Verify Status code for Weather Api ", ForcastActions.getStatusCode(), value);
        System.out.println("Verify api Response status");
    }

    @And("^Response content type should be json$")
    public void responseContentTypeShouldBeJson() {
        System.out.println("Setting Api key");
    }

    @And("^Validate Response has status code$")
    public void validateResponseHasStatusCode() {
        System.out.println("Setting Api key");
    }
}
