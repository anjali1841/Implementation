package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;

public class HomPage extends BaseClass{
	
	public HomPage(RemoteWebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	
	//// part : store all web elements
	
	
	@FindBy(linkText = "Log in")
	WebElement loginMenu;
	
	@FindBy(linkText = "Register")
	WebElement registerMenu;
	
	@FindBy(xpath = "//span[text()=\"Shopping cart\"]")
	WebElement shoppingCart;
	
	@FindBy(linkText = "Computers")
	WebElement computerLink;
	
	@FindBy(linkText = "Apparel & Shoes")
	WebElement apparelShoesLink;
	
	@FindBy(id = "idValue")
	WebElement element1;
	
	@FindBy(className = "idValue")
	WebElement element2;
	
	@FindBy(css = "idValue")
	WebElement element3;
	
	
	//// part 2   : actions
	
	
	
	public Registration clickRegistration()
	{
		try {
			clickElement(registerMenu);
		} catch (Exception e) {
		}
		return new Registration(driver);
	}
	
	
	public LoginPage clickLogin()
	{
		try {
			clickElement(loginMenu);
		} catch (Exception e) {
		}
		return new LoginPage(driver);
	}	
	
	
	public ComputersProducts clickComputers()
	{
		try {
			clickElement(computerLink);
		} catch (Exception e) {
		}
		return new ComputersProducts();
	}
	
	
	
	public ApparelAndShoes clickApparelAndShoes()
	{
		try {
			clickElement(apparelShoesLink);
		} catch (Exception e) {
		}
		return new ApparelAndShoes();
	}
	
	
	

	

	
	

}
