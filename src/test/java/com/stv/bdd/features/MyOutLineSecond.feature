Feature: Search checking

  Scenario Outline: Check search input
    Given Home page is loaded
    And Search bar is visible on display
    When The User enters "<req>" in the searchbar
    Then Search panel is appear

    Examples:
      | req     |
      | run     |
      | gym     |