package web_controls;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class BrowserWindow {
	
	// TODO - Generic method to work with Multiple BrowserWindow

	private WebDriver driver;
	
	public BrowserWindow(WebDriver driver) {
		this.driver = driver;
	}
	

	public void switchToNewWindow() {
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		String w1 = itr.next();
		String w2 = itr.next();
		driver.switchTo().window(w2);
	}

	public void switchToOldWindow() {
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		String w1 = itr.next();
		String w2 = itr.next();
		driver.switchTo().window(w1);
	}

	public void switchToParentWindow() {
		driver.switchTo().defaultContent();
	}

}
