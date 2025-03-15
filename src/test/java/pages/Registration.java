package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;

public class Registration extends BaseClass{
	
	public Registration(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="gender-male")
	WebElement sexMale;
	
	@FindBy(id="gender-female")
	WebElement sexFemale;
	
	@FindBy(id="FirstName")
	WebElement firstNmae;
		
	@FindBy(id="LastName")
	WebElement lastName;

	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement passWord;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassWord;
	
	
	public Registration selectSex() {
		clickElement(sexFemale);
		return this;
	}
	
	public Registration enterFirstName(String firstNameValue)
	{
		enterValue(firstNmae, firstNameValue);
		return this;
	}
	
	public Registration enterLastName(String lastNameValue)
	{
		try {
			enterValue(lastName, lastNameValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return this;
	}
	
	public Registration enterEmail(String emailValue)
	{
		enterValue(email,emailValue);
		return this;
	}
	
	public Registration enterPassword(String passWordValue)
	{
		enterValue(passWord, passWordValue);
		return this;
	}
	
	public Registration enterConfirmPassword(String passWordValue)
	{
		enterValue(confirmPassWord, passWordValue);
		return this;
	}
	
	

}
