Feature: Validate Google search functionality

  Scenario: Verify google search
    Given user navigate to Google website
    When user enter text in searchbox
    And hit enter
    Then user able to see details regarding product
    