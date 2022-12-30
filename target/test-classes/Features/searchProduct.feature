Feature: Search and Place the order for products

@OffersPage
Scenario Outline: Search Experience by product name
Given User is on GreenKart Landing page
When User searched with shortname <vegName> and captured actual name of product
Then User searched for <vegName> shortname in offers page 
And  validate if product name in offers page matches with Landing page

Examples:
|vegName |
| Tom  	 |	
| Beet   |
