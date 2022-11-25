@Contact
Feature: Contact on demoblaze.com


  @ContactAllEmpty
   Scenario Outline: Contact where all fields are empty
    Given I am on contact modal
    When I put <contactemail> in contact email textbox
    And I put <contactname> in contact name textbox
    And I put <contactmessage> in contact message textbox
     And I press Send Message button
    Then error message appears
    
     Examples:
    |contactemail|contactname|contactmessage|
    |            |           |              |
    
   @ContactAllFull
   Scenario Outline: Contact where all fields are not empty
    Given I am on contact modal
    When I put <contactemail> in contact email textbox
    And I put <contactname> in contact name textbox
    And I put <contactmessage> in contact message textbox
     And I press Send Message button
    Then message Thanks for the message!! appears
    
     Examples:
    |contactemail                 |contactname   |contactmessage|
    |jonathan.regan58@yahoo.com   |Jonathan Regan|Halo          |
    

   @ContactEmailOnly
   Scenario Outline: Contact where only email are not empty
    Given I am on contact modal
    When I put <contactemail> in contact email textbox
    And I put <contactname> in contact name textbox
    And I put <contactmessage> in contact message textbox
     And I press Send Message button
    Then error message appears
    
     Examples:
    |contactemail                 |contactname   |contactmessage|
    |jonathan.regan58@yahoo.com   |              |              |
   
      

