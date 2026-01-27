Feature: Herokuapp Testing

  @Smoke
  Scenario: Navigate to A/B Testing
    Given I open herokuapp website
    Then I navigate to A/B Testing page

  @Smoke
  Scenario: Testing Checkboxes
    Given I open herokuapp website
    Then I navigate to Checkboxes page
    And I check the first Checkbox
    And I uncheck the second Checkbox
    
  