package web_controls;

public class DropDown {
	
	/**
	 * Generic method to select by value from Select option
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		Select drop = new Select(element);
		drop.deselectByValue(value);
	}
	
	/**
	 * Generic method to select by index from Select option
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select drop = new Select(element);
		drop.selectByIndex(index);
	}
	
	/**
	 * Generic method to select by visible text from Select option
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		Select drop = new Select(element);
		drop.selectByVisibleText(text);
	}
	
}
