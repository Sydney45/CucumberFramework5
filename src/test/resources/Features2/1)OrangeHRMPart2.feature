@All
Feature: Admin_Login

@Prod
Scenario Outline: Successful login with data table
    Given Launch chrome browser
    When User enter user id as "<username>" and password as "<password>"
    And User click on login button
    Then PageTitle should be "OrangeHRM"
    
    Examples:
       | username | password |
       |   Admin  | admin123 |
       |   Admin  |  ad123   |
	    
