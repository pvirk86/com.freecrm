Feature: Test free crm login functionality

Scenario: Validate login functionality works
Given I open a browser
When I go to free crm link
And I see crm logo
And I see forgot password link
And I see features link
And I see Signup link
And I see Pricing link
And I see Customers link
And I see Contact Link
When I enter username and password
And I click Login button
Then I should see logout link
And I click the contact in the menu
And I wait three seconds
And I enter first name
And I enter last name
And I get text from suffix dropdown
And I enter nick name
And I enter a company
And I enter position
And I enter department
And I enter a supervisor
And I click save button