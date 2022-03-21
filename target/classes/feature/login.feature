@loginFeature
Feature: To validate e2e flow

  @LoginApplication
  Scenario: User Login validation
    Given User launch Browser
    When User launch Sweety application
    And User enter User email as "shringar114210@gmail.com"
    And User enter password as "codetheoryio"
    And I click on login button
    When I Enter blood glucose level as "1"
    Then I validate the blood glucose level as "1" in report
    And I delete the pervious entry
