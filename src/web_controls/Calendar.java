package web_controls;

public class Calendar {
	
	/**
	 * Generic method for select date from calendar using JavascriptExecutor
	 * @param driver
	 * @param element
	 * @param dateVal
	 */
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);	
	}
	
}
