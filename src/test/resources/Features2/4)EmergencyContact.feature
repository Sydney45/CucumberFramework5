@All
Feature: Adding Emergency Contact Details

Background:
    Given Launch chrome browser
    When User enter user id as "Admin" and password as "admin123"
    And User click on login button
    And user clicks on PIM page
    And User enters "jim"
    And User clicks on search
    And User clicks on the searched user
    
@smoke
Scenario: Adding Emergency Contact using excel data table
     When user clicks on emergency contact page
     And user fills the data from excel
     Then it will show successful message 
     

   
     
     
     
     
     
     
     
     