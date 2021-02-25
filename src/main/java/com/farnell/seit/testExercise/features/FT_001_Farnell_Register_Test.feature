#Author: siddharthelango@outlook.com

@registrationAndrememberMeCheckboxTest
Feature: New User registers in farnell.com website 
As a new User I want to be able to register on uk.farnell.com in as few steps as possible.
I want to be able to choose whether my login details are remembered by the site
So that I can utilise express login at my next visit.
I also want to be presented with on screen information that confirms I have successfully registered and see a personalised greeting
So that I know my details are authenticated and I’m securely logged in

@rememberMeCheckBoxDefaultTest
	Scenario: User enters all details in register page and checks if the remember me checkbox is present and selected by default
    Given the user is in uk.farnell.com website using chrome browser
    When the user clicks on Register link
    And the user enters all mandatory details in Registration page
    Then there is a remember me checkbox which is checked by default
    
@rememberMeCheckBoxUncheckTest
	Scenario: User enters all details in register page and unchecks the remember me checkbox
    Given the user is in uk.farnell.com website using chrome browser
    When the user clicks on Register link
    And the user enters all mandatory details in Registration page
    And the user unchecks remember me checkbox
    Then the remember me checkbox is unchecked    
    
@welcomeMessageDisplayTest
	Scenario: User enters all details, registers and a welcome message is displayed
    Given the user is in uk.farnell.com website using chrome browser
    When the user clicks on Register link
    And the user enters all mandatory details in Registration page
    And the user clicks on register button
    Then the user is registered
    And a welcome message is displayed