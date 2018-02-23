package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	// TODO - Generic method to work with Explicit Wait
	
	private WebDriver driver;
	
	public ExplicitWait(WebDriver driver) {
		this.driver = driver;
	}

	public void waitTillElementToBeClickable(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitTillElementFound(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitTillElementToBeSelected(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Wating for max:: " + timeout + " seconds for element to be visible");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element visible on the web page");
		} catch (Exception e) {
			System.out.println("Element not visible on the web page");
		}
		return element;
	}

	public void clickWhenReady(By locator, int timeout) {
		WebElement element;
		try {
			System.out.println("Wating for max:: " + timeout + " seconds for element to be clickable");
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("Element clicked on the web page");
		} catch (Exception e) {
			System.out.println("Element not clickable on the web page");
		}
	}
	
}
