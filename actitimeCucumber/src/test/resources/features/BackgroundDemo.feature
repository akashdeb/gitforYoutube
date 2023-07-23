Feature: To create a Customer and User

  Scenario: To verify whether the Customer is created
    Given the user is logged in to the application
    When the user click on the task module
    And the user clicks on the Add New button
    And then clicks on the New Customer option
    And the user passes the Customer Name
    And passes the Description
    And Clicks on the create customer button
    Then Customer should be created
