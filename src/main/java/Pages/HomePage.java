package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;
import Pages.Camera;
import utilities.Constants;
import utilities.WaitExpectedConditions;

public class HomePage extends BaseClass {
	public By CancelPopUp=By.xpath("//button[text()='✕']");
	public By SendInfo=By.xpath("//input[@title='Search for products, brands and more']");
	public By Search=By.xpath("//button[@type=\"submit\"]");
	public By Electronics=By.xpath("//span[text()='Electronics']");
	public By Camera=By.xpath("//a[text()='Compact & Bridge Cameras']");
	public By CameraAcc=By.xpath("//a[text()='Cameras & Accessories']");
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
		WebElement wb1=driver.findElement(Electronics);
		WebElement wb2=driver.findElement(Camera);
		
		Actions act = new Actions(driver);
		Action set1 = act.moveToElement(wb1).build();
		set1.perform();
		waitCondition(condition.VISIBILITY_OF,Camera,driver,10);
		
		Action set2 = act.moveToElement(wb2).click().build();
		set2.perform();
		waitCondition(condition.ELEMENT_TO_BE_CLICKABLE,CameraAcc,driver,10);
		
		
	}

}
