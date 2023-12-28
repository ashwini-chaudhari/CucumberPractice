Feature: Login Action
Scenario Outline: Successfull login with valid credentials
Given User is on Home Page
When User enter Email as <email> and Password as <password>
And Click on login
Then Page title should be "Dashboard / nopCommerce administration"

Examples:
|email|password|
|admin@yourstore.com|admin|
|test111|admin111|
