Feature: Etsy search feature

  Background: Pre-condition
    Given user is on the Etsy landing page


  Scenario: Etsy default title verification
    Then user should see Etsy title as "Etsy"

  @etsy
  Scenario: Etsy search title verification
    When user searches for "wooden spoon"
    Then user should see "Wooden spoon" in the Etsy title

