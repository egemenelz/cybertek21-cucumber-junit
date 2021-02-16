Feature: Wikipedia Search Feature
  As a user, I should be able to search terms and see related results

  Background: Wikipedia Pre-Condition
    Given User is on Wikipedia home page

  @wiki
  Scenario: User title verification
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title
  @wiki
  Scenario: User header verification
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the main header
