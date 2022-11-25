package com.steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {

	String page;
	
	
	
	
	
	
	@Given("I am on login modal")
	public void i_am_on_login_modal() {
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"login2\"]")).click();	
	}

	@When("I put ax in username login textbox")
	public void i_put_ax_in_username_login_textbox() {
		 WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		 WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("ax");
		 
	}

	@When("I put ax in password login textbox")
	public void i_put_ax_in_password_login_textbox() {
		
		 WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("ax");
	  
	}

	@When("I press log in button")
	public void i_press_log_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}

	@Then("message Wrong password appears")
	public void message_Wrong_password_appears() {
	   
		 WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		 wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Wrong password.");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
	}

	@When("I put jregan in username login textbox")
	public void i_put_jregan_in_username_login_textbox() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("jregan");
	}

	@When("I put jregan in password login textbox")
	public void i_put_jregan_in_password_login_textbox() {
		 WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("jregan");
	}

	@Then("jregan appears on the menubar")
	public void jregan_appears_on_the_menubar() {
		
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]")));
		
		String message = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
	    
		System.out.println(message);
	  
	}

	@Then("log out appears")
	public void log_out_appears() {
		   WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout2\"]")));
		    
	}

	/*@When("I empty username login textbox")
	public void i_empty_username_login_textbox() {
	   
	}

	@When("I empty password login textbox")
	public void i_empty_password_login_textbox() {
	   
	}*/

	@Then("message error Please fill out Username and Password appears from login")
	public void message_error_Please_fill_out_Username_and_Password_appears_from_login() {
		
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.alertIsPresent());
		String message = WebDriverFactory.getDriver().switchTo().alert().getText();
		Assert.assertEquals(message, "Please fill out Username and Password.");
		WebDriverFactory.getDriver().switchTo().alert().accept();
	}

	@When("I put {string} in password login textbox")
	public void i_put_in_password_login_textbox(String string) {
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("jregan");
	}

	@When("I put {string} in username login textbox")
	public void i_put_in_username_login_textbox(String string) {
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("jregan");
	}
	
	
	@When("I press log in")
	public void i_press_log_in() {
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"login2\"]")).click();	
	}

	
	@Given("I am on https:\\/\\/demoblaze.com\\/prod.html?idp_=7 page")
	public void i_am_on_https_demoblaze_com_prod_html_idp__7_page() {
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/prod.html?idp_=7");
	}

	@Given("I am on https:\\/\\/demoblaze.com\\/prod.html?idp_=1 page")
	public void i_am_on_https_demoblaze_com_prod_html_idp__1_page() {
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/prod.html?idp_=1");	
	}
	
	@Given("I am on {string} page")
	public void i_am_on_page(String page) {
	    // Write code here that turns the phrase above into concrete actions
		this.page = page;
		WebDriverFactory.getDriver().navigate().to(this.page);
	}

	
	/*@Given("I am on https:\\/\\/demoblaze.com\\/prod.html?idp_=7 page")
	public void i_am_on_https_demoblaze_com_prod_html_idp__7_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I am on https:\\/\\/demoblaze.com\\/prod.html?idp_=1 page")
	public void i_am_on_https_demoblaze_com_prod_html_idp__1_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	

}
