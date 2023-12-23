Feature: My Account Page
  I want to check register and login pages
  Background: I am on the my account page
    Given I am on the account page
    @test1
    Scenario: I verify User Should Navigate To Register Page Successfully
      When I click on my account and click register
      Then I verify the text register account
      @test1
      Scenario: I verify User Should Navigate To Login Page Successfully
        When I click on my account and click login
        Then I verify the text return customer
        @test1
Scenario: I verify That User Register Account Successfully
          When I click on my account and click register
          And I fill in the register info
          Then I verify the msg account created
          And I click on continue button and my account link and logout
          Then I verify the text account logout
          And I click on continue button after logout
@test1
Scenario: I verify That User Should Login And Logout Successfully
  When I click on my account and click login
  And I fill in return customer info and click login button
  Then I verify the text my account
  And I click on my account and logout
  Then I verify the text account logout successfully and continue button