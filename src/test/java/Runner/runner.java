package Runner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/FeatureWithTags", 
//glue= {"StepDef"}
//)

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.gherkin.model.Scenario;

import Runner.WebDriverFactory;
import io.cucumber.java.AfterStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(
	//	features = "D:\\DemoBlazeTest\\src\\test\\resources\\Features\registerdemoblaze.feature",
	//	features = "src/test/resources/Features",
	//	glue="com.steps"
		//,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//,monochrome = true
		//,publish = true
		//,tags= "@Login and @PositiveLoginExist"
		//"@Buy and @AddToCart1ItemWithLogin"
		//"@CheckPriceOnCartAfterAddToCart1ItemWithoutLogin"
		//"@Buy and @CheckPriceOnCartAfterAddToCart1ItemWithoutLogin"
		//"@Login and @PositiveLoginExistOnProduct"
		//"@Contact and @ContactEmailOnly"
		//"@Contact and @ContactAllFull"
		//"@Login and @NegativeLoginWherePasswordIsEmpty"
		//"@Login and @NegativeLoginWhereUsernameIsEmpty"
		//
		
		//"@Login and @PositiveLoginWrongPassword"
		//"@Register and @PositiveRegisterDuplicate"
		
		
		//"@Home and @HomeToRegister or @Register"
		//)
				/*
				@CucumberOptions(
						features = "src/test/resources/Features"
						,glue = "com.steps"
						,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
						,monochrome = true
					    ,tags= "@Login and @PositiveLoginExist"
						)*/

@CucumberOptions(
		
			features = "src/test/resources/Features",
			glue="com.steps"
			,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			,monochrome = true
			,publish = true
			,tags = "@CartPageAsAPersonWhoHasAddedAnythingToCart or @ModalPlaceOrder or @ModalPlaceOrderFilled or @PressOkOnSuccesfulTransactionModal"
			//"@CartPageAsAPersonWhoNeverAddAnythingToCart"
			//"(@PressNokiaLumia1520 or @AddToCartNokiaLumia1520 or @PressNexus6 or @AddToCartNexus6)"
			//"(@CartPageAsAPersonWhoHasAddedAnythingToCart or @ModalPlaceOrder or @ModalPlaceOrderAllEmpty)"
			//"(@PressNokiaLumia1520 or @AddToCartNokiaLumia1520 or @PressNexus6 or @AddToCartNexus6)"
			//"@CartPageAsAPersonWhoHasAddedAnythingToCart"
			//"(@Buy)"
			//"@PlaceOrder and @CartPageAsAPersonWhoNeverAddAnythingToCart"
			//"@Buy and @PressSamsungGalaxyS6"
			//"@PlaceOrder and @CartPageAsAPersonWhoNeverAddAnythingToCart"
			
			//"(@Login and @PositiveLoginExistOnHome) or (@CartPageAsAPersonWhoNeverAddAnythingToCart)"
			//tags=  "@LoginToAddToCart,@CartPageAsAPersonWhoNeverAddAnythingToCart"
			//"@Login and @PositiveLoginWrongPassword" 
			//"{@LoginToAddToCart and @CartPageAsAPersonWhoNeverAddAnythingToCart}"
			//"@Login and @PositiveLoginWrongPassword" 
			
			//"@PlaceOrder and @LoginAsAPersonWhoNeverAddAnythingToCart"
			//"@Register and @PositiveRegisterNotDuplicate"
			//"@Register and @NegativeRegisterWhereUsernameAndPasswordIsEmpty"
			//"@Login and @PositiveLoginWrongPassword" 
			//"@Login and @PositiveLoginExistOnProduct"
			//"@Login and @PositiveLoginExistOnHome"
)

public class runner extends AbstractTestNGCucumberTests {

	@BeforeClass
	@Parameters({"browser"})
	public void setup(String browser) {
		WebDriverFactory.setupDriver(browser);
		// TODO Auto-generated method stub

	}
	
	
	
	@AfterClass
	public void teardown() {
		WebDriverFactory.getDriver().quit();
		System.out.println("Test ended");
		// TODO Auto-generated method stub

	}

	}


