package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    WebDriverWait wait;
    
	public void sendInfo(WebElement key,String TextToEnter) {
		key.sendKeys(TextToEnter);
	}
    
	public void click(WebElement link)
	{
		link.click();
	}
	public void clear(WebElement TextBox) {
		TextBox.clear();
	}
	public void waitCondition(WaitExpectedConditions conditions,By locator,WebDriver driver,int timeOut) {
	       wait=new WebDriverWait(driver,timeOut);
	        switch (conditions){
	        case PRESENCE_OF_ELEMENT:
	                            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	                            break;
	        case ELEMENT_TO_BE_CLICKABLE: 
	                          wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	                          break;    
	        }
	    }
}
