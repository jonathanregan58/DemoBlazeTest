package com.steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefPlaceOrderCart {
	
	String username;
	String password;
	Integer totalprice;
	String ccnumber;
	String name;
	/*
	@When("I put {string} in password login textbox")
	public void i_put_in_password_login_textbox(String password) {
		this.password = password;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(this.password);
	}

	@When("I put {string} in username login textbox")
	public void i_put_in_username_login_textbox(String username) {
		this.username = username;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(this.username);
	}
	
	@Given("I am on login modal")
	public void i_am_on_login_modal() {
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"login2\"]")).click();	
	}

	@Then("{string} appears on the menubar")
	public void appears_on_the_menubar(String username) {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]")));
		
		String message = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
	}*/

	@Given("{string} and {string} has login")
	public void and_has_login(String username, String password) {
		this.password = password;
		this.username = username;
		
		WebDriverFactory.getDriver().manage().window().maximize();

		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"login2\"]")).click();	
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(this.username);
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(this.password);
        
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]")));
		
		String message = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
		
	}
	
	//@Given("{string} has login")
	//public void has_login(String username) {

	//}

	//@When("access cart page")
	//public void access_cart_page() {
		
			
	//}
	
	
	@When("{string} access cart page")
	public void access_cart_page(String username) {
		this.username = username;
		WebDriverFactory.getDriver().navigate().refresh();
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cartur\"]")));
	    // Write code here that turns the phrase above into concrete actions
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"cartur\"]")).click();
	}
	

	@When("press Place Order Button")
	public void press_place_order_button() {
		int xScrollPosition= 1103; //enter your x co-ordinate
		int yScrollPosition= 191; //enter your y co-ordinate
		
		/*
		 WebDriverFactory.getDriver().navigate().refresh();
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		WebDriverWait wait2 = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")));
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();	*/
		
		WebElement element = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));

		JavascriptExecutor executor = (JavascriptExecutor) WebDriverFactory.getDriver();

		executor.executeScript("window.scroll(" + xScrollPosition + ", " + yScrollPosition + ");");
		executor.executeScript("arguments[0].click();", element);
		//*[@id="page-wrapper"]/div/div[2]/button
		
	}

	@Then("message that nothing has been added should appear")
	public void message_that_nothing_has_been_added_should_appear() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		wait.until(ExpectedConditions.alertIsPresent());
		String message = WebDriverFactory.getDriver().switchTo().alert().getText();
		Assert.assertEquals(message, "Nothing has been added.");
		WebDriverFactory.getDriver().switchTo().alert().accept();
	}

	@Then("the price should be\"{int}\"")
	public void the_price_should_be(Integer totalprice) {
	    this.totalprice = totalprice;
WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"totalp\"]")));
	}
	
	@Given("{string} is on cart page")
	public void is_on_cart_page(String username) {
		this.username = username;
	    String URL = WebDriverFactory.getDriver().getCurrentUrl();
		Assert.assertEquals(URL, "https://demoblaze.com/cart.html");
	}

	@When("{string} presses Place order button")
	public void presses_place_order_button(String username) {
		this.username = username;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();	
	}

	@Then("place order modal appears")
	public void place_order_modal_appears() {
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderModal\"]/div/div")));
	}

	@Given("{string} is on modal")
	public void is_on_modal(String username) {
WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),60);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderModal\"]/div/div")));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")));
	}

	@When("{string} presses purchase button")
	public void presses_purchase_button(String username) {
		this.username = username;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();	
	}

	@Then("message Please fill out Name and Creditcard appears")
	public void message_please_fill_out_name_and_creditcard_appears() {
 WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),60);
		 
		 wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Please fill out Name and Creditcard.");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
	}
	
	
	@When("{string} types {string} on name textbox")
	public void types_on_name_textbox(String username, String name) {
	    this.username = username;
	    this.name = name;
	    WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(this.name);
	}

	@When("types {string} on credit card number textbox")
	public void types_on_credit_card_number_textbox(String ccnumber) {
	   this.ccnumber = ccnumber;
	   WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"card\"]")).sendKeys(this.ccnumber);
	}

	@Then("modal that says transaction is succesful appear")
	public void modal_that_says_transaction_is_succesful_appear() {
WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]/div[7]/div/button")));
	}

	@Given("{string} is on Succesful Transaction Modal")
	public void is_on_succesful_transaction_modal(String username) {
	    this.username = username;
WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(120)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]/div[7]/div/button")));
	}

	@When("{string} presses OK button on Succesful Transaction Modal")
	public void presses_ok_button_on_succesful_transaction_modal(String username) {
		 this.username = username;
		 WebDriverFactory.getDriver().findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();	
	}

	@Then("{string} is redirected to home page")
	public void is_redirected_to_home_page(String username) {
	    this.username = username;
	    String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/index.html");
		
	}
	
}
