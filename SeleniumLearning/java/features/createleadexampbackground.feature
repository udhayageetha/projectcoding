Feature: Create Lead functionality

@Regression @Smoke
Scenario Outline: Login and create createLead application

Given enter <username> and <password>
And click login button
And click leads button
And click create lead link
When enter <companyname> and <lastname> and <firstname>
And click submit button
Then createlead should be created.

Examples:
|username|password|companyname|lastname|firstname|
|'DemoCSR'|'crmsfa'|'capge'|'gee'|'udh'|
|'DemoSalesManager'|'crmsfa'|'tcs'|'rani'|'anbu'|

@Smoke
Scenario: Login and create createLead application

Given enter 'DemoSalesManager' and 'crmsfa'
And click login button
And click leads button
And click create lead link
When enter 'cts' and 'mayu' and 'samyu'
And click submit button
Then createlead should be created.