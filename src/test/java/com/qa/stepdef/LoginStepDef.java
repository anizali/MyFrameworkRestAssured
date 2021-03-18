package com.qa.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @When("^I enter invalid username \"([^\"]*)\"$")
    public void iEnterInvalidUsername(String username) {
        System.out.println("I am in step definition arg value " + username);


    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {

        System.out.println("I am in step definition Password value " + password);

    }
}
