Feature: Login and selecting a flight

@HomePage
Scenario Outline: Browsing experience of a user 
Given User is on spicejet Landing page 
When User logs in with credentials
And User searches for desired location flights
Then User Checks the flight price 
And User LogsOut


