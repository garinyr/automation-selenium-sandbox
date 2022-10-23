@automationpractice

Feature: Access Website

  Scenario Outline: Positive case access automationpractice website
    Given user access page automationpractice
    When users on <website>
    Then compare current url with <url>

    Examples:
      | url                                                  | website         |
      | "https://rahulshettyacademy.com/AutomationPractice/" | "Practice Page" |
