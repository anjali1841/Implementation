package base;

import org.openqa.selenium.WebElement;

public interface Wrappers {
	
	/**
	 * This method will launch the application
	 * @param browser - the browser where the application needs to be launched
	 * @param url  - url of the application with http or https
	 */
	
	public void invokeApp(String browser, String url);
	
	
	/**
	 * This method will enter the value in text field
	 * @param element : web element of the element
	 * @param data : the data which needs to be sent/text
	 */
	
	public void enterValue (WebElement element, String data);
	
	
	/**
	 * This method will click the element link/check box/radio button
	 * @param element : web element of the element
	 */
	
	public void clickElement (WebElement element);
	
	
	/**
	 * This method get the title of the current page and return the same value
	 * @param element : web element of the element
	 * @return
	 */
	
	public String getTitle ();
	
	
	/**
	 * This method get the text/message/info of the element and return the same value
	 * @param element : web element of the element
	 * @return
	 */
	
	public String getText (WebElement element);	
	
	
	/**
	 * This method select the value from dropdown based on given index
	 * @param element : web element of the element
	 * @param indexValue : An integer value - the location of the value from dropdown list
	 * @return
	 */
	
	public void selectByIndex (WebElement element, int indexValue);
	
	
	/**
	 * This method select the value from dropdown based on visible text
	 * @param element : web element of the element
	 * @param visibleText : visible text from DOM
	 * @return
	 */
	
	public void selectByVisibleText (WebElement element, String visibleText);
	
	
	/**
	 * This method select the value from dropdown based on value
	 * @param element : web element of the element
	 * @param value : The attribute value from DOM
	 * @return
	 */
	
	public void selectByValue (WebElement element, String value);
	
	
	/**
	 * This method to change the driver focus to Parent window
	 */
	
	public void swithToParentWindow();
	
	
	/**
	 * This method to change the driver focus to other opened window
	 */
	
	public void swithToWindow();
	
	
	/**
	 * This method to change the driver focus to frame
	 */
	
	public void swithToFrame(String frameName);
	
	
	/**
	 * This method to change the driver focus to alert and accept
	 */
	
	public void acceptAlert();
	
	
	/**
	 * This method to change the driver focus to alert and dismiss
	 */
	
	public void dismissAlert();
	
	
	/**
	 * This method to change the driver focus to alert and get the info and return that
	 */
	
	public String getAlertText();
	
	
	/**
	 * This method to change the driver focus to alert and send text
	 * @param textValue : the value which needs to be passed for text in alert
	 */
	
	public void sendInfoToAlert(String textValue);
	
	
	/**
	 * This method close the active browser
	 */
	
	public void closeBrowser();
	
	
	/**
	 * This method close all the browser
	 */
	
	public void closeAllBrowser();
	
	////// No need to write logic for below methods
	
	public void takeSnaop();
	
	public void tabOutField (WebElement element);
	
	public void scrollPageDown();
	
	public String getAttributeBy (WebElement element);
	
	public void loadSubjects();
	
	public void unloadSubjects();

}
