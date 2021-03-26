Feature: Login functionality for Adactin Applications 
Scenario: User enters username and password 

	Given  User launch the application 
	When user enter "gokuleswar" as username 
	And user enter "gokuleswar1995" as password 
	Then user verify valid username and valid password 

	
Scenario: User enter information about search hotel 
	Given User select options "value" and select "Adelaide" as location details from dropdown bo 
	When user select options "value" and select "Hotel Hervey" as hotel name 
	And user select options "value" and select "Super Deluxe" as room type 
	And user select options "value" and select "1"  as no.of room 
	And user enter check in date as "10/03/2021" 
	And user enter check out date as "12/03/2021" 
	And  User select options "value" and select "1" as choice 
	And  user select options "value" and select "0" as choice as enter. 
	Then user click search button to verify 
	
	
Scenario: Select hotel & Book hotel 
	Given User click radio button 
	When user click continue button 
	When user enter "Karthi" as name 
	When User enter "V" as last name 
	When user enter "40/2 Senai Vinayagar kovil street, Kadayanallur" as address 
	When user enter "1267987654329037" as Credit card No. 
	When user select options "value" and select "MAST" as answer 
	When user select options "value" and select "12" as no. 
	When user select options "value" and select "2022" as year 
	When user enter "184" as CVV No. 
	When user click BOOK click button 
	Then user click logo  button