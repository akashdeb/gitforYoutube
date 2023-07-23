# author : Akash
Feature: feature to test login functionality
	@param
  Scenario Outline: check login is successful with valid credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | admin    | manager  |
      | trainee  | trainee  |
	@hc
	Scenario: check login of user A is successful with valid credentials
    Given user A is on the login page
    When user A enters username and password
    And user A clicks on login button
    Then user A is navigated to the home page