package stepdefinition;

import org.openqa.selenium.OutputType;

import com.aventstack.extentreports.util.Assert;


import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomPage;
import pages.Registration;

public class UserRegistration extends BaseClass{
	
	public HomPage homepage;
	public Registration registratioPage; 
	
	
	@Given("the user in homepage of the application")
	public void the_user_in_homepage_of_the_application() {
		
		invokeApp(prop.getProperty("browser"), prop.getProperty("url"));
		
		homepage = new HomPage(driver);
		
	}

	@Then("user click the registration link")
	public void user_click_the_registration_link() {
		
		
		registratioPage = homepage.clickRegistration();
	    
	}

	@Then("user fill the registration form")
	public void user_fill_the_registration_form() {
		
		registratioPage.selectSex()
						.enterFirstName("tester1")
						.enterLastName("qa")
						.enterEmail("qatest@gmail.com")
						.enterPassword("qa@123")
						.enterConfirmPassword("qa@123");
	    
	}

	@Then("validate the success message")
	public void validate_the_success_message() {
		String expectedTitle="Demo Web Shop. Register";
		String pageTitle = getTitle();
		System.out.println(pageTitle);
		org.junit.Assert.assertEquals(expectedTitle, pageTitle);
	    
	}

@After
	public void takesnap(Scenario scenario)
	{
		
		if ((scenario.isFailed())) {
			byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

}
