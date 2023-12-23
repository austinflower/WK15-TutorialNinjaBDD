package com.tutorialninja.steps;

import com.tutorialninja.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuStep {
    @Then("^I verify the text Desktops$")
    public void iVerifyTheTextDesktops() {
        String actualText = new HomePage().gettextonpage();
        String expecteddesktoptest = "Desktops";
        Assert.assertEquals(actualText,expecteddesktoptest);
    }

    @Then("^I verify the text laptop and notebook$")
    public void iVerifyTheTextLaptopAndNotebook() {
        String actuallapnoteTEXT = new HomePage().gettextonpage();
        String expectedlaptop = "Laptops & Notebooks";
        Assert.assertEquals(actuallapnoteTEXT,expectedlaptop);
    }

    @When("^I mouse hover on Component and click show all component$")
    public void iMouseHoverOnComponentAndClickShowAllComponent() {
        new HomePage().clickOnComponentLink();
    }

    @Then("^I verify the text components$")
    public void iVerifyTheTextComponents() {
        String actualCompText = new HomePage().gettextonpage();
        String expectedCompText = "Components";
        Assert.assertEquals(actualCompText,expectedCompText);
    }
}
