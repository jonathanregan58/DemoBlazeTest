@Buy
Feature: Buy items on demoblaze.com

    @PressSamsungGalaxyS6
    Scenario Outline: Press galaxy s6
    Given <username> and <password> has login
     When <username> choose galaxy s6
     Then <username> is on galaxy s6 page
    Examples:
    |username |password |
    |jregan581|jregan581|
    
     @AddToCartSamsungGalaxyS6
     Scenario Outline: Add to cart galaxy s6
     Given <username> is on galaxy s6 page beforehand
     When <username> press Add to Cart button
     Then message Product added (for Galaxy s6) appears
     
     Examples:
    |username |password |
    |jregan581|jregan581|
 
   
    @PressNokiaLumia1520
     Scenario Outline: Press Nokia Lumia 1520
    Given <username> and <password> has login(second user)
     When <username> choose Nokia Lumia 1520
     Then <username> is on Nokia Lumia 1520 page
    Examples:
    |username |password |
    |jregan582|jregan582|
    
    
    @AddToCartNokiaLumia1520
     Scenario Outline: Add to cart Nokia Lumia 1520
     Given <username> is on Nokia Lumia 1520 page beforehand
     When <username> press Add to Cart button on Nokia Lumia 1520 page
     Then message Product added (for Nokia Lumia 1520) appears
     
     Examples:
    |username |password |
    |jregan582|jregan582|
    
    
    @PressNexus6
     Scenario Outline: Press Nexus 6
    Given <username> is on Nokia Lumia 1520 page after add to cart Nokia Lumia 1520
     When <username> go back to home page
     And <username> chooses Nexus 6
     Then <username> is on Nexus 6 page
    Examples:
    |username |password |
    |jregan582|jregan582|
    
    
    @AddToCartNexus6
     Scenario Outline: Add to cart Nexus 6
     Given <username> is on Nexus 6 page beforehand
     When <username> press Add to Cart button on Nexus 6 page
     Then message Product added (for Nexus 6) appears
     
     Examples:
    |username |password |
    |jregan582|jregan582|
    
    ##@CartPageAsAPersonWhoNeverAddAnythingToCart
    ##Scenario Outline: Place Order button should display that nothing has been added since User never adds anything
    ##Given "<username>" and "<password>" has login
    ##When access cart page
    ##And press Place Order Button
    ##Then message that nothing has been added should appear
    
    ##Examples:
    ##|username |password|
    ##|jregan   |jregan  |
    ##|jregan58 |jregan58|
    
    
  ##@Given("I am on login page")
##public void i_am_on_login_page() {
  ##  // Write code here that turns the phrase above into concrete actions
   ## throw new io.cucumber.java.PendingException();
##}

##@Then("{string} appears on the menubar")
##public void appears_on_the_menubar(String string) {
  ##  // Write code here that turns the phrase above into concrete actions
   ## throw new io.cucumber.java.PendingException();
##}