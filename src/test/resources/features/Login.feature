@feature
Feature:Library App Login

  User Story:As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  #Background is for pre-conditions
  Background: User is already in login page
    Given User is on the login page

  @librarian @employee
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as Student
    When user enters student username
    And user enter student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When  user enters admin username
    And user enters admin password
    Then user should see the dashboard