Feature: Functionality of login leaftaps

Scenario: TC001 Login with valid credentials
Given Open the chrome browser
And load the url
And enter the username as DemoSalesManager
And enter the password as crmsfa
When click on login
Then homepage should get displayed
