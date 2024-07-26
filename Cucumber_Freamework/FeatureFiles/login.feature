@tag
Feature: Admin Login
I want to use this template to check Admin Login

@validData
Scenario: Check Admin Login with valid data
Given i open browser with url "http://www.orangehrm.qedgetech.com/"
Then i should see login page
When i enter username as "Admin"
And i enter password as "Qedge123!@#"
And i click login
Then i should see admin module
When i click logout
Then i should see login page
When i close browser

@invalidData
Scenario Outline: Check Admin Login with invalid data
Given i open browser with url "http://www.orangehrm.qedgetech.com/"
Then i should see login page
When i enter username as "<username>"
And i enter password as "<password>"
And i click login
Then i should see error message
When i close browser

Examples:
|username|password|
|Admin|Qedge@123|
|admin|Qedge123!@#|
|admin1|Qegebjh123!@#|
|||
|     |    |

