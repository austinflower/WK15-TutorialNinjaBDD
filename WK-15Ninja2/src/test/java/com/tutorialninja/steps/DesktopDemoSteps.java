package com.tutorialninja.steps;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopDemoSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I mouse hover and click on desktop tab$")
    public void iMouseHoverAndClickOnDesktopTab() {
        new HomePage().mouseHoverToDesktop();
    }

    @And("^I click on show all desktops$")
    public void iClickOnShowAllDesktops() {
        new HomePage().setShowAllDesktops();
    }

    @And("^I select product sort by Name \\(Z - A\\)$")
    public void iSelectProductSortByNameZA() {
        new DesktopPage().sortByPositionZtoA();
    }


    @And("^I select product sort by Name \\(A - Z\\)$")
    public void iSelectProductSortByNameAZ() {
        new DesktopPage().alpaOrder();
    }

    @And("^I select product HP LP(\\d+)$")
    public void iSelectProductHPLP(int arg0) {
        new DesktopPage().clickOnSelectHP();
    }

    @Then("^I verify text HP LP(\\d+)$")
    public void iVerifyTextHPLP(int arg0) {
        String actualHP = new DesktopPage().verifyHPLP3065();
        String expHP = "HP LP3065";
        Assert.assertEquals(actualHP,expHP);

    }


    @And("^I select Delivery Date$")
    public void iSelectDeliveryDate()  {
        new DesktopPage().selectDeliveryDate();

    }
    @And("^I enter qty (\\d+)$")
    public void iEnterQty(int arg0) {
        new DesktopPage().enterQty();
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new DesktopPage().clickaddbutton();
    }

    @Then("^I verify success Message$")
    public void iVerifySuccessMessage() {
        String actualaddchart = new DesktopPage().getShoppingCartText();
        System.out.println(actualaddchart);
        String expaddchart = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualaddchart,expaddchart);
    }

    @And("^I click on link shopping cart success message$")
    public void iClickOnLinkShoppingCartSuccessMessage() {
        new DesktopPage().clickonshoppingcartmsg();
    }

    @Then("^I verify the text shopping cart$")
    public void iVerifyTheTextShoppingCart() {
        String actshopcart = new DesktopPage().getverifyshoppingcart();
        String expshopcart = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(actshopcart,expshopcart);
        String actprod = new DesktopPage().getproduct();
        String expprod = "HP LP3065";
        Assert.assertEquals(actprod,expprod);
        String actdlvdate = new DesktopPage().getdeliverydate();
        String expdlvdate = "Delivery Date:2024-11-30";
        Assert.assertEquals(actdlvdate,expdlvdate);
        String actmodel = new DesktopPage().getmodel();
        String expmodel = "Product 21";
        Assert.assertEquals(actmodel, expmodel);
        String acttotal = new DesktopPage().gettotal();
        String exptotal = "$122.00";
        Assert.assertEquals(acttotal, exptotal);
    }
}
