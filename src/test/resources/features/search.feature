@smoke
Feature: Searching M-net functionality
  User Story:
  As a user, I should be able to search on the main page


  Scenario: User should be able to see Hilfe & Service and go back to main page
    Given user is on the M-net home page
    Then user accept cookies
    When user click hilfeServiceButton
    And user scroll down and up the page
    And user goes back to the main page
    Then user should see "Highspeed-Internet von M-net mit bis zu 1.000 Mbit/s" title
