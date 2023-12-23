package com.tutorialninja.steps;

import com.tutorialninja.pages.CheckoutPage;
import com.tutorialninja.pages.LaptopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LaptopStep {
    @Given("^I am on laptop homepage$")
    public void iAmOnLaptopHomepage() {

    }

    @When("^I mouse hover on Laptop Tab and click show all$")
    public void iMouseHoverOnLaptopTabAndClickShowAll() {
        new LaptopPage().clickonlapnotelink();
    }

    @And("^I select sort by price high to low$")
    public void iSelectSortByPriceHighToLow() {
        new LaptopPage().getsortvalue();
    }

    @Then("^I verify Laptop price high to low$")
    public void iVerifyLaptopPriceHighToLow() {
        String actualprice = new LaptopPage().getverifyHL();
        String expectedprice = "Price (High > Low)";
        Assert.assertEquals(actualprice,expectedprice);
    }

    @And("^I select the product MacBook$")
    public void iSelectTheProductMacBook() {
        new LaptopPage().selectmacbook();
    }

    @Then("^I verify the text MacBook$")
    public void iVerifyTheTextMacBook() {
        String actmactext = new LaptopPage().verifymacbook();
        String expmactext = "MacBook";
        Assert.assertEquals(actmactext,expmactext);
    }

    @And("^I Click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new LaptopPage().clickaddmactocart();
    }

    @Then("^I verify mac success message$")
    public void iVerifyMacSuccessMessage() {
        String actshoptext = new LaptopPage().getmacshoppingcarttext();
        String expshoptext ="shopping cart";
        Assert.assertEquals(actshoptext,expshoptext);
    }

    @And("^I click on the shopping cart display msg$")
    public void iClickOnTheShoppingCartDisplayMsg() {
        new LaptopPage().clickonmacshoppingcartmsglink();
    }

    @Then("^I verify the text mac shopping cart$")
    public void iVerifyTheTextMacShoppingCart() {
        String actshop = new LaptopPage().getmacshoppingcarttextkg();
        String expshop = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actshop,expshop);
        String actmb = new LaptopPage().getmacproduct();
        String expmb = "MacBook";
        Assert.assertEquals(actmb,expmb);
    }

    @And("^I change quantity two and update$")
    public void iChangeQuantityTwoAndUpdate() {
        new LaptopPage().getnewmacbookqt();
        new LaptopPage().getupdatemacqt();
    }

    @Then("^I verify cart modified and new total$")
    public void iVerifyCartModifiedAndNewTotal() {
        String act1 = new LaptopPage().getmodifiedshopcart();
        String exp1 = "Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(act1,exp1);
        String act2 = new LaptopPage().getnewtotal();
        String exp2 = "$1,204.00";
        Assert.assertEquals(act2,exp2);
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new LaptopPage().getclickonmaccheckout();
    }



    @Then("^I verify checkout and new customer text$")
    public void iVerifyCheckoutAndNewCustomerText() {
        String act3 = new CheckoutPage().verifycheckoutpagetext();
        String exp3 = "Checkout";
        Assert.assertEquals(act3,exp3);
        String act4 = new CheckoutPage().verifycopnewcustomer();
        String exp4 = "New Customer";
        Assert.assertEquals(act4,exp4);
    }

    @And("^I click on guest checkout and continue tab$")
    public void iClickOnGuestCheckoutAndContinueTab() {
        new CheckoutPage().clickonguestbuttonandcontinue();
    }



    @And("^I fill the mandatory fields and click continue$")
    public void iFillTheMandatoryFieldsAndClickContinue() throws InterruptedException {
        new CheckoutPage().fillinmandatoryfields();
    }


    @Then("^I verify warning payment msg$")
    public void iVerifyWarningPaymentMsg() {
        String actualwarning = new CheckoutPage().getwarning();
        String expectedwarning = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(actualwarning,expectedwarning);
    }
}
