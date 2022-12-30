Feature: Place the order for product

@PlaceOrder
Scenario Outline: Ordering experience 
Given User is on GreenKart Landing page
When User searched with shortname <vegName> and captured actual name of product
And Added "3" items of the selected product to cart	
Then User proceeds to Checkout and validate <vegName> item in checkout page	
And  verify if user is able to enter promo code and place the order

Examples:
|vegName |
| Tom  	 |