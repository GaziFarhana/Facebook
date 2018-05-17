Feature: Checking facebook login functionality

@Smoke1
Scenario Outline: user is able to login to facebook page
Given user at facebook homepage
When user enter his username "<username>" "<value>"
Then user enter his password "<pass>" "<value1>"
And user click on login button


Examples: 
|username|value|pass|value1|
|username|fredoz0999|pass|abcd1234|

