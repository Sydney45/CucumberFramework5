@All
Feature: Add Employee

Background:
    Given Launch chrome browser
    When User enter user id as "Admin" and password as "admin123"
    And User click on login button

@regression   
Scenario Outline: Adding mutiple employees with this table
    When user clicks on PIM page
    And user clicks on add new employee
    And user enters "<FirstName>","<MiddleName>","<LastName>"
    And user clicks on add image
    Then user clicks on save
    
    Examples:
       | FirstName | MiddleName | LastName |
       |   jim     |  sydney    | dsouza   |    
       |  shiva    |   nand     |  giri    |    
       | prathamesh|   null     |  patil   |    
    