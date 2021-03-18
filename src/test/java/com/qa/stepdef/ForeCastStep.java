package com.qa.stepdef;

import com.qa.actions.ForcastActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ForeCastStep {

    @Given("^I look up for the weather forecast for next 16 days with postal code \"([^\"]*)\"$")
    public void theUserSentsGETRequestAndGetTheTimestampAndWeatherValue(String postCode) {
        ForcastActions.requestForecastWithGet(postCode);
    }


    @When("^I check the temperature is between \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckTheTemperatureIsBetweenAnd(Float minTemp, Float maxTemp) {
        ForcastActions.getAllDatesForTemperatureRange(minTemp, maxTemp);
    }

    @And("^I check the wind speed is between \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCheckTheWindSpeedIsBetweenAnd(Float minSpeed, Float maxSpeed) {
        ForcastActions.getAllDatesForWindSpeedRange(minSpeed, maxSpeed);
    }

    @And("^I check to see if the UV index is less than or equal to \"([^\"]*)\"$")
    public void iCheckToSeeIfTheUVIndexIsLessThanOrEqualTo(Float maxUvIndex) {
        ForcastActions.getAllDatesForUVIndex(maxUvIndex);
    }

    @Then("^List all the dates which satisfy surfer requirement$")
    public void listAllTheDatesWhichSatisfySurferRequirement() {
        ForcastActions.displayDates();
    }
}
