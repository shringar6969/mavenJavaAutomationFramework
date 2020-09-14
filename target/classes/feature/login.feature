
@loginFeature
Feature: Title of your feature
  I want to use this template for my feature file

  @LoginApplication
  Scenario: User Login validation
    Given User launch Browser
    When user launch application 
    And User Click on Login Button
    And User enter User email as "learn@test.com" 
    And User enter password as "Test@123"
    Then Validate Application login successfull
  