@RegisterOnFacebook
Feature: Register on facebook


  @PositiveRegisterNotDuplicate
   Scenario Outline: Register where Username and password is filled and the data does not exist on database
    Given I am on registration modal
    When I put "<username>" in username textbox
    And I put "<password>" in password textbox
     And I press sign up button
    Then message Sign up successful appears
    
     Examples:
    |username |password |
    |jregan58 |jregan58 |
    |jregan581|jregan581|
    
        
     @PositiveRegisterDuplicate
   Scenario Outline: Register where Username and password is filled and the data does exist on database
    Given I am on registration modal
    When I put <username> in username textbox
    And I put <password> in password textbox
     And I press sign up button
    Then message error This user already exist appears
    

    Examples:
    |username|password|
    |aa      |abc     |

  @NegativeRegisterWhereUsernameAndPasswordIsEmpty
  Scenario: Register where Username and password is not filled
    Given I am on registration modal
   
    When I press sign up button
    Then message error Please fill out Username and Password appears

   
      
   @NegativeRegisterWhereUsernameIsEmpty
  Scenario: Register where Username is not filled
  Given I am on registration modal
  
    When I put "abcdef58" in password textbox
     And I press sign up button
    Then message error Please fill out Username and Password appears



   @NegativeRegisterWherePasswordIsEmpty
  Scenario: Register where Password is not filled
    Given I am on registration modal
    When I put "jonathanregan58" in username textbox
  
     And I press sign up button
    Then message error Please fill out Username and Password appears

