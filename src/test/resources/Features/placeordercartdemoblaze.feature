@PlaceOrder
Feature: Place Order on demoblaze.com

  ##  @LoginAsAPersonWhoNeverAddAnythingToCart
   ## Scenario Outline: Do login as a person who never adds anything on cart
   ## Given I am on login modal
   ##  When I put "<username>" in username login textbox
   ## And I put "<password>" in password login textbox
   ##  And I press log in button
   ## Then "<usernameonmenubar>" appears on the menubar 
   ## And log out appears
   ## Examples:
   ## |username |password|usernameonmenubar|
   ## |jregan   |jregan  |jregan           |
    
    
    @CartPageAsAPersonWhoNeverAddAnythingToCart
    Scenario Outline: Place Order button should display that nothing has been added since User never adds anything to the cart
    Given "<username>" and "<password>" has login
    When "<username>" access cart page
    And press Place Order Button
    Then message that nothing has been added should appear
    
    Examples:
    |username |password|
    |jregan   |jregan  |
    |jregan58 |jregan58|
    
    
    @CartPageAsAPersonWhoHasAddedAnythingToCart
    Scenario Outline: Cart page for User has added something
    Given "<username>" and "<password>" has login
    When "<username>" access cart page
    Then the price should be"<price>" 
    
    Examples:
    |username |password |price|
    |jregan581|jregan581|360  |
    |jregan582|jregan582|1470 |
    |jregan583|jregan583|360  |
    @ModalPlaceOrder
    Scenario Outline: Modal appears after place order button appears
    Given "<username>" is on cart page
    When "<username>" presses Place order button
    Then place order modal appears
    
     Examples:
    |username |
    |jregan581|
    |jregan582|
    |jregan583|
    
    @ModalPlaceOrderAllEmpty
    Scenario Outline: No data at all at place order modal
    Given "<username>" is on modal
    #//*[@id="orderModal"]/div/div
    When "<username>" presses purchase button
    #//*[@id="orderModal"]/div/div/div[3]/button[2]
    Then message Please fill out Name and Creditcard appears
    #Please fill out Name and Creditcard.
     Examples:
    |username |
    |jregan581|
    |jregan582|
    |jregan583|
    
    @ModalPlaceOrderFilled
    Scenario Outline: Name and credit card number place order modal then press
    Given "<username>" is on modal
    #//*[@id="orderModal"]/div/div
    When "<username>" types "<name>" on name textbox
    #//*[@id="name"]
    And types "<number>" on credit card number textbox
    #//*[@id="card"]
    And "<username>" presses purchase button
    Then modal that says transaction is succesful appear
    #/html/body/div[10]/div[7]/div/button
     Examples:
    |username |name |number|
    |jregan581|Regan|123   |
    |jregan582|Regan|123   |
    |jregan583|Regan|123   |
    
    @PressOkOnSuccesfulTransactionModal
    Scenario Outline: Press OK on Succesful Transaction Modal
    Given "<username>" is on Succesful Transaction Modal
    When "<username>" presses OK button on Succesful Transaction Modal
    Then "<username>" is redirected to home page
    #https://www.demoblaze.com/index.html
    
    Examples:
    |username |
    |jregan581|
    |jregan582|
    |jregan583|