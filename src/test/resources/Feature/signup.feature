Feature: checking facebook signup functionality

@Smoke4
Scenario Outline: user is able to sign up in facebook page
Given i am at facebook signup page
When i am entering my first name "<fname>" "<fvalue>"
Then i am entering my last name "<lname>" "<lvalue>"
#And i am entering my email "<email>" "<evalue>"
#Then i am entering my password "<pass>" "<pvalue>"
#And i am entering month "<month>" "<mvalue>"
#Then i am enrering day "<day>" "<dvalue>"
#And i am entering year "<year>" "<yvalue>"
#Then i am clicking female
#And i click on sign up

Examples: 
|fname|fvalue|lname|lvalue|email|evalue|pass|pvalue|month|mvalue|day|dvalue|year|yvalue|
|fname|Gazi|lname|Farhana|email|sdgakjgdkaj|pass|asxc123|month|May|day|7|year|1991|