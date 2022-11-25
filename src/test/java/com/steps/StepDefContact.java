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

public class StepDefContact {

	@Given("I am on contact modal")
	public void i_am_on_contact_modal() {
		
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");

		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();		
		
		
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("I put  in contact email textbox")
	public void i_put_in_contact_email_textbox() {
	    
	}

	@When("I put  in contact name textbox")
	public void i_put_in_contact_name_textbox() {
	   
	}

	@When("I put  in contact message textbox")
	public void i_put_in_contact_message_textbox() {
	   
	}

	@When("I press Send Message button")
	public void i_press_Send_Message_button() {
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();	
		
	}

	@Then("error message appears")
	public void error_message_appears() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Error");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
	}

	@When("I put jonathan.regan58@yahoo.com in contact email textbox")
	public void i_put_jonathan_regan58_yahoo_com_in_contact_email_textbox() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);		 
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("jonathan.regan58@yahoo.com");
	}

	@When("I put Jonathan Regan in contact name textbox")
	public void i_put_Jonathan_Regan_in_contact_name_textbox() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);	
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("Jonathan Regan");
	}

	@When("I put Halo in contact message textbox")
	public void i_put_Halo_in_contact_message_textbox() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);	
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("Halo");	
	}

	@Then("message Thanks for the message!! appears")
	public void message_Thanks_for_the_message_appears() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		
 WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),10);
		 
		 wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Thanks for the message!!");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
		
		
	}
	
}


