Feature: Search checking

  Scenario Outline: Check search input and dropdown
    Given Homepage is loaded
    And Search bar is visible
    When The User enters "<request>" in the search bar
    Then Dropdown menu appears
#  And Dropdown menu contains Run
    When The User clears search bar
    Then Dropdown menu is hidden
    And Search bar is empty

    Examples:
      | request |
      | run     |
      | gym     |