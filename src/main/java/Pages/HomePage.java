package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;
import utilities.WaitExpectedConditions;

/**
 * This class includes the functions for first page(home-page) of POM for
 * flipkart site [both scenarios -> 1 and 2]
 * 
 * @author surabhi.srivastava
 *
 */
public class HomePage extends BaseClass {
	private By CancelPopUp = By.xpath("//button[text()='✕']");
	private By SendInfo = By.xpath("//input[@title='Search for products, brands and more']");
	private By Search = By.xpath("//button[@type=\"submit\"]");
	private By Electronics = By.xpath("//span[text()='Electronics']");
	private By Camera = By.xpath("//a[text()='Compact & Bridge Cameras']");
	private By CameraAcc = By.xpath("//a[text()='Cameras & Accessories']");

	WebDriver driver;

	WebDriverWait wait;

	WaitExpectedConditions condition;

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;

	}

	/**
	 * This function cancels the modal that pops up on loading of the page
	 * 
	 * @param testName : Nmae of the test case
	 */
	public void cancelModal(String testName) {
		try {
			click(driver.findElement(CancelPopUp));
		} catch (Exception e) {
			System.out.println(e);
		}

		logfile.log(testName, "Cancel Modal");
	}

	/**
	 * Enters the string on search box and clicks on search button
	 * 
	 * @param textToEnter
	 * @param TestName
	 */
	public void search(String textToEnter, String testName) {
		sendInfo(driver.findElement(SendInfo), textToEnter);
		click(driver.findElement(Search));
		logfile.log(testName, "Search the product");
	}

	/**
	 * MouseHover over Electronics and then Compact & Bridge Cameras and clicks on
	 * it
	 * 
	 * @param TestName
	 */
	public void mouseHover(String testName) {
		performHover(Electronics);
		waitCondition(condition.VISIBILITY_OF, Camera, 10);
		performHoverAndClick(Camera);
		waitCondition(condition.VISIBILITY_OF_ELEMENT_LOCATED, CameraAcc, 10);
		logfile.log(testName, "MouseHover");

	}

}
