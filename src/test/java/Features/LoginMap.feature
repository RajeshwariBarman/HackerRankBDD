@ignore
Feature: Hacker Rank login feature 

Scenario: Login feature 

Given user is already on Login Page
When title of login page is Hacker rank 
Then user enters username and password
 		| user | pass|
		| raajeshwaribarman@gmail.com | Raj123.|
		
Then user clicks on login button
Then user search item in tab
	|item|
	|test1|


