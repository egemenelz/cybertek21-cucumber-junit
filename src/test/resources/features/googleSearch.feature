Feature: Google search functionality

  Agile Story: As a user, when I am on the google search page,
  I should be able to search whatever
  I want, and see relevant information

  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see title is Google

  @googlewip
  Scenario Outline: User search title verification
    Given User is on Google home page
    When User searches for "<fruit>"
    Then User should see "<fruit>" in the title

  Examples:
  |fruit|
  |apple|
  |orange|
  |watermelon|
  |banana    |
  |cucumba   |

  # Given    --> is used for creating pre-condition
  # When     --> is used for when the action happens
  # Then     --> is used for Assertion
  # And      --> is usually used when there are repeating steps
  # But      -->