package com.tutorialninja.steps;

import com.tutorialninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyAccountSteps {
    @Given("^I am on the account page$")
    public void iAmOnTheAccountPage() {
    }

    @When("^I click on my account and click register$")
    public void iClickOnMyAccountAndClickRegister() {
        new MyAccountPage().clickonRegister();
    }

    @Then("^I verify the text register account$")
    public void iVerifyTheTextRegisterAccount() {
        String actualregacct = new MyAccountPage().getregistertext();
        String expectedregacct = "Register Account";
        Assert.assertEquals(actualregacct,expectedregacct);
    }

    @When("^I click on my account and click login$")
    public void iClickOnMyAccountAndClickLogin() {
        new MyAccountPage().clickonLogin();
    }

    @Then("^I verify the text return customer$")
    public void iVerifyTheTextReturnCustomer() {
        String actualreturncust = new MyAccountPage().getreturncust();
        String expectedreturncust = "Returning Customer";
        Assert.assertEquals(actualreturncust,expectedreturncust);
    }

    @And("^I fill in the register info$")
    public void iFillInTheRegisterInfo() {
        new MyAccountPage().fillinregisterinfo();
    }

    @Then("^I verify the msg account created$")
    public void iVerifyTheMsgAccountCreated() {
        String actualacctcreated = new MyAccountPage().getregistertext();
        String expectedacctcreated ="Your Account Has Been Created!";
        Assert.assertEquals(actualacctcreated,expectedacctcreated);
    }

    @And("^I click on continue button and my account link and logout$")
    public void iClickOnContinueButtonAndMyAccountLinkAndLogout() {
        new MyAccountPage().fillinRESTInfo();
    }

    @Then("^I verify the text account logout$")
    public void iVerifyTheTextAccountLogout() {
        String actualacclogout = new MyAccountPage().getregistertext();
        String expectedacclogout = "Account Logout";
        Assert.assertEquals(actualacclogout,expectedacclogout);
    }

    @And("^I click on continue button after logout$")
    public void iClickOnContinueButtonAfterLogout() {
        new MyAccountPage().logoutcontinue();
    }

    @And("^I fill in return customer info and click login button$")
    public void iFillInReturnCustomerInfoAndClickLoginButton() {
        new MyAccountPage().getreturncustlogin();
    }

    @Then("^I verify the text my account$")
    public void iVerifyTheTextMyAccount() {
        String actualmyacct = new MyAccountPage().getmyaccounttext();
        String expectedmyacct = "My Account";
        Assert.assertEquals(actualmyacct,expectedmyacct);
    }

    @And("^I click on my account and logout$")
    public void iClickOnMyAccountAndLogout() {
        new MyAccountPage().clickonlogout();
    }

    @Then("^I verify the text account logout successfully$")
    public void iVerifyTheTextAccountLogoutSuccessfully() {
        String actuallogout = new MyAccountPage().getregistertext();
        String expectedlogout = "Account Logout";
        Assert.assertEquals(actuallogout,expectedlogout);
    }

    @Then("^I verify the text account logout successfully and continue button$")
    public void iVerifyTheTextAccountLogoutSuccessfullyAndContinueButton() {
        String actuallogout = new MyAccountPage().getregistertext();
        String expectedlogout = "Account Logout";
        Assert.assertEquals(actuallogout,expectedlogout);
        new MyAccountPage().logoutcontinue();
    }
}
