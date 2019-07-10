Feature: Data Driven Testing
Scenario: Login using different credentials
Scenario Outline: Login using below users
When login using <Username> and <Password>
Examples:
|Username|Password|
|parthi|abc|
|ragnar|abc|