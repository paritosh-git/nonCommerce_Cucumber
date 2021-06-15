Feature: Login functionality

@Regression
Scenario: Successfull login with valid credetial

Given user launch chrome browser
When user open url "https://admin-demo.nopcommerce.com/login"
And user enter email as "admin@yourstore.com" and password as "admin"
And click login button
Then page title should be "Dashboard / nopCommerce administration"
When user click on Log out link
And close browser

@sanity
Scenario Outline:

Given user launch chrome browser
When user open url "https://admin-demo.nopcommerce.com/login"
And user enter email as "<email>" and password as "<password>"
And click login button
Then page title should be "Dashboard / nopCommerce administration"
When user click on Log out link
And close browser

Examples:

   |  email | password |
   |admin@yourstore.com |admin|
   |admin@yourstore.com |admin|
  
   