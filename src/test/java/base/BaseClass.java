package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass implements Wrappers{
	
	public RemoteWebDriver driver;
	public static Properties prop;

	@Override
	public void invokeApp(String browser, String url) {
		
		try {
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("The browser launched properly");
			}
			
			if(browser.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "./drivers/chromedriver.exe");
				driver = new EdgeDriver();
			}
			
			if(browser.equals("firebox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Browser Not launched properly");
		}
		
	}

	@Override
	public void enterValue(WebElement element, String data) {

		try {
			element.sendKeys(data);
			System.out.println("Able to type the given text");
		} catch (NoSuchElementException e) {
			System.err.println("Not able to find the element in DOM");
		}
		catch (ElementNotInteractableException e) {
			System.err.println("Not able to interct the element");
		}
		
		
	}

	@Override
	public void clickElement(WebElement element) {
		
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("not clicked");
		}
		
	}

	@Override
	public String getTitle() {
		String pageTitle=driver.getTitle();
		return pageTitle;
	}

	@Override
	public String getText(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectByIndex(WebElement element, int indexValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectByVisibleText(WebElement element, String visibleText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectByValue(WebElement element, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swithToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swithToWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swithToFrame(String frameName) {
		
		try {
			driver.switchTo().frame(frameName);
		} catch (NoSuchFrameException e) {
			System.out.println("The frmae is not availble");
		}catch (WebDriverException e) {
			System.err.println("unknown erros");
		}
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendInfoToAlert(String textValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAllBrowser() {
		// TODO Auto-generated method stub
		
		driver.quit();
		
	}

	@Override
	public void takeSnaop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tabOutField(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollPageDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAttributeBy(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadSubjects() {
		
		try {
		
			FileInputStream fis = new FileInputStream("C:\\Users\\jegatheeswari.k\\Projects\\COE\\Selenium Training\\Batch I\\ProjectImplementation\\src\\test\\resources\\config.properties");
			prop = new Properties();
			prop.load(fis);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void unloadSubjects() {


		prop=null;
		
	}

}
