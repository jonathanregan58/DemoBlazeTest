package com.steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefBuy {

	Integer int1 = 1520;
	Integer int2 = 6;
	
	@Given("jregan581 and jregan581 has login")
	public void jregan581_and_jregan581_has_login() {
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"login2\"]")).click();	
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("jregan581");
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("jregan581");
        
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]")));
		
		String message = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
	}

	@When("jregan581 choose galaxy s6")
	public void jregan581_choose_galaxy_s6() {
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
	}

	@Then("jregan581 is on galaxy s6 page")
	public void jregan581_is_on_galaxy_s6_page() {
		String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=1");
		//  https://www.demoblaze.com/prod.html?idp_=1
			//  https://demoblaze.com/prod.html?idp_=1
	}

	@When("jregan581 press Add to Cart button")
	public void jregan581_press_add_to_cart_button() {
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	}

	
	@Given("jregan581 is on galaxy s6 page beforehand")
	public void jregan581_is_on_galaxy_s6_page_beforehand() {
	  String URL = WebDriverFactory.getDriver().getCurrentUrl();
	  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=1");
	}


	@Then("message Product added \\(for Galaxy s6) appears")
	public void message_product_added_for_galaxy_s6_appears() {
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		 
		 wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Product added.");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
	}
	
	@Given("jregan582 and jregan582 has login\\(second user)")
	public void jregan582_and_jregan582_has_login_second_user() {
		WebDriverFactory.getDriver().navigate().to("http://demoblaze.com/");
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"login2\"]")).click();	
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("jregan582");
		
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("jregan582");
        
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]")));
		
		String message = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"nameofuser\"]")).getText();
	}

	@When("jregan582 choose Nokia Lumia {int}")
	public void jregan582_choose_nokia_lumia(Integer int1) {
	   this.int1 = int1;
	   WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();
	}

	@Then("jregan582 is on Nokia Lumia {int} page")
	public void jregan582_is_on_nokia_lumia_page(Integer int1) {
		this.int1 = int1;
		String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=2");
	}

	@Given("jregan582 is on Nokia Lumia {int} page beforehand")
	public void jregan582_is_on_nokia_lumia_page_beforehand(Integer int1) {
		this.int1 = int1;
		String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=2");
	}

	@When("jregan582 press Add to Cart button on Nokia Lumia {int} page")
	public void jregan582_press_add_to_cart_button_on_nokia_lumia_page(Integer int1) {
		this.int1 = int1;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	}

	@Then("message Product added \\(for Nokia Lumia {int}) appears")
	public void message_product_added_for_nokia_lumia_appears(Integer int1) {
		this.int1 = int1;
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		 
		 wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Product added.");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
	}

	@Given("jregan582 is on Nokia Lumia {int} page after add to cart Nokia Lumia {int}")
	public void jregan582_is_on_nokia_lumia_page_after_add_to_cart_nokia_lumia(Integer int1, Integer int2) {
		this.int1 = int1;
		this.int2 = int1;
		String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=2#");
	}

	@When("jregan582 go back to home page")
	public void jregan582_go_back_to_home_page() {
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();	
	}

	@When("jregan582 chooses Nexus {int}")
	public void jregan582_chooses_nexus(Integer int2) {
		 WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")).click();
	}

	@Then("jregan582 is on Nexus {int} page")
	public void jregan582_is_on_nexus_page(Integer int2) {
		String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=3");
	}

	@Given("jregan582 is on Nexus {int} page beforehand")
	public void jregan582_is_on_nexus_page_beforehand(Integer int2) {
		String URL = WebDriverFactory.getDriver().getCurrentUrl();
		  Assert.assertEquals(URL, "https://demoblaze.com/prod.html?idp_=3");
	}

	@When("jregan582 press Add to Cart button on Nexus {int} page")
	public void jregan582_press_add_to_cart_button_on_nexus_page(Integer int2) {
		this.int2 = int2;
		WebDriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
	}

	@Then("message Product added \\(for Nexus {int}) appears")
	public void message_product_added_for_nexus_appears(Integer int2) {
		this.int1 = int1;
		WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(),Duration.ofSeconds(60)); 
		 
		 wait.until(ExpectedConditions.alertIsPresent());

		 Alert alert = WebDriverFactory.getDriver().switchTo().alert();
		       
		 String message = alert.getText();
		 
		 System.out.println(message);
		
		 System.out.println(alert.getText());
		
		 Assert.assertEquals(message, "Product added.");
		
		 WebDriverFactory.getDriver().switchTo().alert().accept();
	}
	
	
}
