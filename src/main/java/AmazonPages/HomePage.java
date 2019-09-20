package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;
import utilities.WaitExpectedConditions;

public class HomePage extends BaseClass{

	WebDriver driver;

	WebDriverWait wait;

	WaitExpectedConditions condition;
	
	private By sendInfo=By.xpath("//input[@type='text']");
	private By search=By.xpath("//span[@id='nav-search-submit-text']");
	
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;

	}
	
	public void search(String textToEnter, String testName) {
		
		sendInfo(driver.findElement(sendInfo), textToEnter);
		//waitCondition(condition.ELEMENT_TO_BE_CLICKABLE, search, 10);
		performHoverAndClick(search);  //Element not getting clicked due to JavaScript or AJAX calls present so wait followed by normal click won't suffice ,so actions is to be used
		logfile.log(testName, "Search the product");
	}

}
