Feature: Hacker Rank login feature 
@abc
Scenario Outline: Login feature 

Given user is already on Login Page
When title of login page is Hacker rank 
Then user enters "<username>" and "<password>" and "<item>"
#When user enters "<username>" and "<password>" and "<item>"
#Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user search "<item>" in tab



Examples:
	| username | password | item |
	| raajeshwaribarman@gmail.com |Raj123.| 123 |
	| raajeshwaribarman@gmail.com|Raj123.|344|
	
#Scenario: After fail Scenario

#Given user is already on Login Page
#When title of login page is Hacker rank 

@test
Scenario Outline: Login feature1

Given user is already on Login Page
When title of login page is Hacker rank 
Then user enters "<username>" and "<password>"
#When user enters "<username>" and "<password>" and "<item>"
Examples:
	| username | password | item |
	| raajeshwaribarman@gmail.com |Raj123.|123555|
	

#@test1
#Scenario Outline:	
#Given user is already on Login Page
#Examples:
#	| username | password | item |
#	| raajeshwaribarman@gmail.com |Raj123.|123555|

	