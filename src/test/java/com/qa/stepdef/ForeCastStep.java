package com.qa.stepdef;

import com.qa.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForeCastStep {

    String apiKey;

    @Given("^The user have proper API key$")
    public void theUserHaveProperAPIKey() {

        apiKey = Constants.WEATHER_API_KEY;
        System.out.println("Setting Api key" + apiKey);
    }

    @When("^The user sents GET request and get the Timestamp and weather value$")
    public void theUserSentsGETRequestAndGetTheTimestampAndWeatherValue() {
    }

    @Then("^API response should return status as \"([^\"]*)\"$")
    public void apiResponseShouldReturnStatusAs(int value) {

        System.out.println("Setting Api key" + value);
    }

    @And("^Response content type should be json$")
    public void responseContentTypeShouldBeJson() {
        System.out.println("Setting Api key" + apiKey);
    }

    @And("^Validate Response has status code$")
    public void validateResponseHasStatusCode() {
        System.out.println("Setting Api key" + apiKey);
    }
}
