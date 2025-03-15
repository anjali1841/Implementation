package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(RemoteWebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	/// part - 1 : storing the webelements
	
	
	@FindBy(id="Email")
	WebElement emailName;
	
	@FindBy(id="Password")
	WebElement passWord;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginButton;
	
	
	// part 2 : actions
	
	
	public LoginPage enterEmail()
	{
		enterValue(emailName, "preeti10@gmail.com");
		return this;
	}
	
	
	public LoginPage enterPassWord()
	{
		enterValue(passWord, "p@gmail");
		return this;
	}
	
	
	public UserHomePage clickLoginButton()
	{
		clickElement(loginButton);
		return new UserHomePage();
	}
	
	
	
	

}
