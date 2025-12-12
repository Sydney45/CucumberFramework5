@All
Feature: Adding Employee Personal Details

Background:
    Given Launch chrome browser
    When User enter user id as "Admin" and password as "admin123"
    And User click on login button
    And user clicks on PIM page
    
@smoke
Scenario: Adding Employee Details using datatable
    When User enters "jim"
    And User clicks on search
    And User clicks on the searched user
    And User enter following user details
	    |Liscense Number|Liscense Expiry |Date of Birth|
	    | 123456789     |   2025-30-11   |  2000-09-02 |
	    | 987654321     |   2025-15-2    |  1998-06-12 |
    And User enter his nationality
    And User enters his maritial status
    And User enter his gender
    Then User clicks on save
    
    
	   
	    


     
 
       

    
    
    