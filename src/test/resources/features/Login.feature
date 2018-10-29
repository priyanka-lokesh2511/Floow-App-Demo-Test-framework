Feature: Testing the Login Functionality of the Floow App

Scenario Outline: Verification of Login Functionality with invalid Credentials
Given The user is on the login screen
When The user enters invalid <Email> and <password>
Then Login error is shown

Examples:
|Email                  |password|
|abc@yahoo.com          |abc     |
|pink@hotmail.com       |jkh     |


#Scenario Outline: Verification of successfull Registration
#Given The user is on the login screen
#When The user enters <Email>,<password>,<firstName>,<surname>,<DateOfBirth>,<postalCode>
#Then Welcome screen is shown

#Examples:
#|Email                          |password    |firstName  |surname   |DateOfBirth  |postalCode|
#|green_grass@yahoo.com          |Green1234   |Green      |Grass     |29/01/1987   |FR5 9YT   |
#|red_apple@gmail.com            |Red1234     |Red        |Apple     |05/06/1990   |TY1 8TG   |


