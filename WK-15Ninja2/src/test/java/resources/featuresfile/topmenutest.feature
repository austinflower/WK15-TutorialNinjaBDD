Feature: Top Menu Test
  I want to confirm desktop, laptop and component page
  Background: I am on the main home page
    Given I am on homepage
    @test3
    Scenario: I verify User Should Navigate To Desktops Page Successfully
      When I mouse hover and click on desktop tab
      And I click on show all desktops
      Then I verify the text Desktops
      @test3
      Scenario: I verify User Should Navigate To Laptops And Notebooks Page
        When I mouse hover on Laptop Tab and click show all
        Then I verify the text laptop and notebook
@test3
Scenario: I verify User Should Navigate To Components Page
  When I mouse hover on Component and click show all component
  Then I verify the text components