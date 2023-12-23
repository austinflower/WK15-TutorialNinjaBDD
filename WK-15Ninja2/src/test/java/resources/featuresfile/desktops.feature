Feature: Desktop page test
  As a user i want to check desktop page and add product into cart

  Background: I am on homepage of tutorial ninja website
    Given I am on homepage

  @test2
  Scenario: User should arrange product in alphabetical order successfully
    When I mouse hover and click on desktop tab
    And I click on show all desktops
    And I select product sort by Name (Z - A)
    @test2
    Scenario: User should Added To Shopping Cart SuccessFully
      When I mouse hover and click on desktop tab
      And I click on show all desktops
      And I select product sort by Name (A - Z)
      And I select product HP LP3065
      Then I verify text HP LP3065
      And I select Delivery Date
      And I enter qty 1
      And I click on Add to cart button
      Then I verify success Message
      And I click on link shopping cart success message
      Then I verify the text shopping cart