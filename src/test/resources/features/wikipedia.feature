Feature: Wikipedia Search Feature
  As a user, I should be able to search terms and see related results

  Background: Wikipedia Pre-Condition
    Given User is on Wikipedia home page


  Scenario: User title verification
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" is in the wiki title

  Scenario: User header verification
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button
    Then user sees "Steve Jobs" in the main header
  @wiki
  Scenario Outline: Wikipedia search header verification
    When User types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then User sees "<expectedMainHeader>" in the main header
    Then User sees "<expectedTitle>" is in the wiki title

    Examples: search terms we are going to search in the wikipedia
      | searchValue  | expectedMainHeader | expectedTitle |
      | Steve Jobs   | Steve Jobs         | Steve Jobs    |
      | Kuzzat Altay | Kuzzat Altay       | Kuzzat Altay  |
