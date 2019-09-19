package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import logs.CreateLog;

/**
 * This class contains the common methods of selenium
 * 
 * @author surabhi.srivastava
 *
 */
public class BaseClass {
	private WebDriver driver;
	private WebDriverWait wait;
	public CreateLog logfile;
	public Actions act;

	public BaseClass(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
		logfile = new CreateLog();
		act = new Actions(driver);
	}

	public void sendInfo(WebElement key, String TextToEnter) {
		key.sendKeys(TextToEnter);
	}

	public void click(WebElement link) {
		link.click();
	}

	public void clear(WebElement TextBox) {
		TextBox.clear();
	}

	public void performHover(By locator) {

		Action set = act.moveToElement(driver.findElement(locator)).build();
		set.perform();
	}

	public void performHoverAndClick(By locator) {

		Action set = act.moveToElement(driver.findElement(locator)).click().build();
		set.perform();
	}

	public void waitCondition(WaitExpectedConditions conditions, By locator, int timeOut) {
		wait = new WebDriverWait(driver, timeOut);
		switch (conditions) {
		case PRESENCE_OF_ELEMENT:
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			break;
		case VISIBILITY_OF_ELEMENT_LOCATED:
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			break;
		case VISIBILITY_OF:
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
			break;

		}
	}

}
