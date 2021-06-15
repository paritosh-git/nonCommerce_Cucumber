Feature: Customers 

      
      Background: Below are common step for every scenario 
    Given user launch chrome browser 
	When user open url "https://admin-demo.nopcommerce.com/login" 
	And user enter email as "admin@yourstore.com" and password as "admin" 
	And click login button 
	Then  User can view dashboard 

@Regression
Scenario: Add New Customer 
	Given user launch chrome browser 
	When user open url "https://admin-demo.nopcommerce.com/login" 
	And user enter email as "admin@yourstore.com" and password as "admin" 
	And click login button 
	Then  User can view dashboard 
	When User click on customers menu 
	And Click on customer menu item 
	And Click on add new button 
	Then User can view add new customer page 
	When User enter customer info 
	And click on save button 
	Then User can view confirmation msg "The new customer has been added successfully." 
	And close browser 
	
	
#Scenario: Search customer by  using emailid 
#    When User click on customers menu 
#	And Click on customer menu item 
#	And Enter customer email 
#	When click on search button 
#	Then user should  found email in the search table 
#	And close browser 
#        
        
        