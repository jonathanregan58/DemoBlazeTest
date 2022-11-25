@Login
Feature: Login on demoblaze.com with username and password


  @PositiveLoginWrongPassword
   Scenario Outline: Login where Username exits but wrong password
    Given I am on login modal
    When I put <username> in username login textbox
    And I put <password> in password login textbox
     And I press log in button
    Then message Wrong password appears
    
     Examples:
    |username|password|
    |ax      |ax      |
    
   @PositiveLoginExistOnHome
   Scenario Outline: Login where Username and password is filled and the data does exist on database
    Given I am on login modal
    When I put <username> in username login textbox
    And I put <password> in password login textbox
     And I press log in button
    Then <username> appears on the menubar 
    And log out appears
    

    Examples:
    |username|password|
    |jregan  |jregan  |
    
    
    @PositiveLoginExistOnProduct
   Scenario Outline: Login when User on product pagewhere Username and password is filled and the data does exist on database
    Given I am on "<product>" page
    When I press log in
    And I put <username> in username login textbox
    And I put <password> in password login textbox
     And I press log in button
    Then <username> appears on the menubar 
    And log out appears
    

    Examples:
    |product                               |username|password|
    |https://demoblaze.com/prod.html?idp_=7|jregan  |jregan  |
    |https://demoblaze.com/prod.html?idp_=1|jregan  |jregan  |
    
  @NegativeLoginWhereUsernameAndPasswordIsEmpty
  Scenario: Login where Username and password is not filled
    Given I am on login modal
   
    When I press log in button
    Then message error Please fill out Username and Password appears from login

   
      
   @NegativeLoginWhereUsernameIsEmpty
  Scenario: Login where Username is not filled
  Given I am on login modal
    
    When I put "jonathanregan58" in password login textbox
     And I press log in button
    Then message error Please fill out Username and Password appears from login



   @NegativeLoginWherePasswordIsEmpty
  Scenario: Login where Password is not filled
    Given I am on login modal
    When I put "jonathanregan58" in username login textbox
   
     And I press log in button
    Then message error Please fill out Username and Password appears from login

