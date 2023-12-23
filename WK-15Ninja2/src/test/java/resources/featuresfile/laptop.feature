Feature: Laptop page Test
  As a user i want to check laptop page and add product into cart

  Background: I am on laptop homepage of tutorial ninja website
    Given I am on laptop homepage
    @test
    Scenario: User should verify Products Price Display High To Low Successfully
    When I mouse hover on Laptop Tab and click show all
    And I select sort by price high to low
    Then I verify Laptop price high to low

      @test
      Scenario: User should verify that the place order successfully
        When I mouse hover on Laptop Tab and click show all
        And I select sort by price high to low
        Then I verify Laptop price high to low
        And I select the product MacBook
        Then I verify the text MacBook
        And I Click on ‘Add To Cart’ button
        Then I verify mac success message
        And I click on the shopping cart display msg
        Then I verify the text mac shopping cart
        And I change quantity two and update
        Then I verify cart modified and new total
        And I click on checkout button
        Then I verify checkout and new customer text
        And I click on guest checkout and continue tab
        And I fill the mandatory fields and click continue
        Then I verify warning payment msg






