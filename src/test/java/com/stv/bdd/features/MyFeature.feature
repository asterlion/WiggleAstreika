Feature: Sign in

  Scenario: 03. Input invalid email address
    Given Sign in form
    When The User enters invalid email address
    And The User goes to the password field
    Then Warning message appears


