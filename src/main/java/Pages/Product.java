package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;
import utilities.WaitExpectedConditions;

/**
 * This class contains methods of second-page of POM of flipkart
 * site[second-scenario]
 * 
 * @author surabhi.srivastava
 *
 */
public class Product extends BaseClass

{
	private WebDriver driver;
	private WebDriverWait wait;
	private By Compare = By.xpath("//span[text()='COMPARE']");
	private By Highlights = By.xpath("//span[text()='Highlights']");

	public Product(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;

	}

	/**
	 * This function clicks on AddToCompare checkbox for first 3 elements
	 * 
	 * @param size     : Number of elements to be compared
	 * @param testName
	 */

	public void addToCompare(int size, String testName) {
		WebElement we = null;
		for (int i = 1; i <= size; i++) {
			we = driver.findElement(By.xpath("(//span[contains(text(),'Compare')])[" + i + "]"));
			we.click();

		}
		logfile.log(testName, "Add To Compare");

	}

	/**
	 * This method clicks on compare button after adding products to compare
	 * 
	 * @param testName
	 */

	public void clickCompare(String testName) {
		driver.findElement(Compare).click();
		waitCondition(WaitExpectedConditions.VISIBILITY_OF_ELEMENT_LOCATED, Highlights, 10);
		logfile.log(testName, "Click on Compare");

	}
}
