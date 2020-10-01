Feature: Assignment

  Scenario: Create a test script to sign up the Operative Underground web app
    When I open Operative Underground web app
    And I register new account with email successfully
    Then I will log in and redirect to home screen automatically

  Scenario Outline: Create test script to sign in the Operative Underground web app
    When I open Operative Underground web app login page
    And I login to app by <Login type> with <Username> and <Password>
    Then I will log in and redirect to home screen automatically
    Examples:
      | Login type | Username  | Password  |
#      | Facebook   |
      | Google     | hughauto1 | 123456aA@ |
      | Email      | a@a.ca    | 123456    |