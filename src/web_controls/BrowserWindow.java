package web_controls;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class BrowserWindow {

	private static WebDriver driver;

	public static void switchToNewWindow() {
		Set s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String w1 = (String) itr.next();
		String w2 = (String) itr.next();
		driver.switchTo().window(w2);
	}

	public static void switchToOldWindow() {
		Set s = driver.getWindowHandles();
		Iterator itr = s.iterator();
		String w1 = (String) itr.next();
		String w2 = (String) itr.next();
		driver.switchTo().window(w1);
	}

	public static void switchToParentWindow() {
		driver.switchTo().defaultContent();
	}

}
