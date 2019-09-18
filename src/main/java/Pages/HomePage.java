package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;
import utilities.WaitExpectedConditions;

public class HomePage extends BaseClass
{
	private By CancelPopUp=By.xpath("//button[text()='✕']");
	private By SendInfo=By.xpath("//input[@title='Search for products, brands and more']");
	private By Search=By.xpath("//button[@type=\"submit\"]");
	private By Electronics=By.xpath("//span[text()='Electronics']");
	private By Camera=By.xpath("//a[text()='Compact & Bridge Cameras']");
	private By CameraAcc=By.xpath("//a[text()='Cameras & Accessories']");
	WebDriver driver;
	WebDriverWait wait;
	WaitExpectedConditions condition;
	
	
	public HomePage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		this.driver=driver;
		this.wait=wait;
		
	}
	//Cancels the modal box that pops up on site loading
	public void CancelModal() {
		try {
		click(driver.findElement(CancelPopUp));}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	//Enters the string on the search box and clicks on search
	public void search(String textToEnter)
	{
		sendInfo(driver.findElement(SendInfo), textToEnter);
		click(driver.findElement(Search));
		
	}
	
	//MouseHover over Electronics and then Compact & Bridge Cameras and clicks on it
	public void mouseHover()
	{
		Actions act = new Actions(driver);
		Action set1 = act.moveToElement(driver.findElement(Electronics)).build();
		set1.perform();
		waitCondition(condition.VISIBILITY_OF,Camera,driver,10);
		Action set2 = act.moveToElement(driver.findElement(Camera)).click().build();
		set2.perform();
		waitCondition(condition.VISIBILITY_OF_ELEMENT_LOCATED,CameraAcc,driver,10);
		
		
	}

}
