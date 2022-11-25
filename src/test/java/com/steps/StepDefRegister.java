package com.steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.runner;
import Runner.WebDriverFactory;
//import com.runner.Screenshot;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class StepDefRegister {
	
	/*private WebDriver driver;
	private WebDriverWait wait;
	private By regusername = By.xpath("//*[@id=\"sign-username\"]");
	private By regpassword = By.xpath("//*[@id=\"sign-password\"]");
	private By signup = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");*/

	String username;
	String password;
	
	@When("I put {string} in username textbox")
	public void i_put_in_username_textbox2(String username) {
		this.username = username;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys(this.username);
	}

	@When("I put {string} in password textbox")
	public void i_put_in_password_textbox2(String password) {
		this.password = password;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys(this.password);
	}
	
	
	@Given("I am on registration modal")
	public void i_am_on_registration_modal() {
		 WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");

		 WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"signin2\"]")).click();		 
		//*[@id="signin2"]
	}

	@When("I put {string} in username register textbox")
	public void i_put_in_username_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//wait.until(ExpectedConditions.visibilityOfElementLocated(regusername));
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("jonathanregan58");
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		//*[@id="sign-username"]
		
		//*[@id="sign-username"]
	}

	@When("I put {string} in password register textbox")
	public void i_put_in_password_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("abcdef58");
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}

	
	
	@Then("message error Please fill out Username and Password appears")
	public void message_error_Please_fill_out_Username_and_Password_appears() {
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		String message = WebDriverFactory.getDriver().switchTo().alert().getText();
		Assert.assertEquals(message, "Please fill out Username and Password.");
		WebDriverFactory.getDriver().switchTo().alert().accept();
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}

	/*@When("I empty username register textbox")
	public void i_empty_username_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I empty password register textbox")
	public void i_empty_password_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}*/

	
	
	@Then("message error This user already exist appears")
	public void message_error_This_user_already_exist_appears() {
		
		//WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		 // WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		    wait.until(ExpectedConditions.alertIsPresent());

		    Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		    
		    
		String message = alert.getText();
		System.out.println(message);
		System.out.println(alert.getText());
		Assert.assertEquals(message, "This user already exist.");
		WebDriverFactory.getDriver().switchTo().alert().accept();
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
	
	}
	
	@Then("message Sign up successful appears")
	public void message_Sign_up_successful_appears() {
		//WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		 WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		 // WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		    wait.until(ExpectedConditions.alertIsPresent());

		    Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		    
		    
		String message = alert.getText();
		System.out.println(message);
		System.out.println(alert.getText());
		Assert.assertEquals(message, "Sign up successful.");
		WebDriverFactory.getDriver().switchTo().alert().accept();
		
	}

	@When("I put jregan58 in username register textbox")
	public void i_put_jregan58_in_username_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I put jregan58 in password register textbox")
	public void i_put_jregan58_in_password_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@When("I put aa in username textbox")
	public void i_put_aa_in_username_textbox() {
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"sign-username\"]")).sendKeys("aa");
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}

	@When("I put abc in password textbox")
	public void i_put_abc_in_password_textbox() {
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"sign-password\"]")).sendKeys("abc");
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}

	@When("I press sign up button")
	public void i_press_sign_up_button() {
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	
	

}
