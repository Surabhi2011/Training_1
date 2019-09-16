package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;
import utilities.WaitExpectedConditions;

public class Camera extends BaseClass{
	WebDriver driver;
	WebDriverWait wait;
	
	public Camera(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		this.driver=driver;
		this.wait=wait;
		
	}
	public By Compare=By.xpath("//span[text()='COMPARE']");
	public By Highlights=By.xpath("//span[text()='Highlights']");
	//clicks on AddtoCompare checkbox of first 3 elements
	public void addtoCompare(int size) {
		WebElement we = null;
		for(int i=1;i<=size;i++)
		{
			we=driver.findElement(By.xpath("(//span[contains(text(),'Compare')])["+i+"]"));
			we.click();

	}
		}
	//clicks on the compare button after clicking on AddtoCompare
	public void ClickCompare() {
		driver.findElement(Compare).click();
		waitCondition(WaitExpectedConditions.ELEMENT_TO_BE_CLICKABLE,Highlights,driver,10);
		
		
	}
}
