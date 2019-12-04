package com.jalasoft.calculator.steps;

import com.jalasoft.calculator.pages.CalculatorPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class CalculatorSteps {

    CalculatorPage calculator = new CalculatorPage();

    @Given("^I press the button \"([^\"]*)\"$")
    public void iPressTheButton(String button) {
        calculator.pressButton(button);
    }


    @And("^I press the button add$")
    public void iPressTheButtonAdd() {
        calculator.pressButtonAdd();
    }


    @When("^I press the button equal$")
    public void iPressTheButtonEqual() {
        calculator.pressButtonEqual();
    }

    @Then("^I should see the number \"([^\"]*)\" in the screen$")
    public void iShouldSeeTheNumberInTheScreen(String value) {
        calculator.verifyNumberInTheScreen(value);

    }

    @And("I press the division button")
    public void iPressTheDivisionButton() {
        calculator.pressButtonDivision();
    }

    @And("I press the substraction button")
    public void iPressTheSubstractionButton() {
        calculator.pressButtonSubstraction();
    }

    @And("I press the multiplication button")
    public void iPressTheMultiplicationButton() {
        calculator.pressButtonMultiplication();
    }
}

