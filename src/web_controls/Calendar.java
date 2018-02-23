package web_controls;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calendar {
	
	// TODO - Generic method to work with DatePicker/Calendar
	
	public Calendar() {
		
	}
	
	/**
	 * Generic method for select date from calendar using JavascriptExecutor
	 * @param driver
	 * @param element
	 * @param dateVal
	 */
	public void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);	
	}
	
}
