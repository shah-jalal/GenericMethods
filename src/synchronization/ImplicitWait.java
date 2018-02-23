package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ImplicitWait {
	
	// TODO - Generic method to work with Implicit Wait

	private WebDriver driver;
	
	public ImplicitWait(WebDriver driver) {
		this.driver = driver;
	}

	public void waitTillPageLoad(int seconds) {
		driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
	}

	public void waitTime(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}
}
