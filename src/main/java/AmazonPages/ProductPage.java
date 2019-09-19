package AmazonPages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class ProductPage extends BaseClass {

	private WebDriver driver;
	
	private WebDriverWait wait;
	
	private By sortBy=By.xpath("(//select[@name])[2]");
	private By itemBlock=By.xpath("//div[@class='a-section a-spacing-medium']");
	private By itemRating=By.xpath("//div[@class='a-section a-spacing-medium']//i[contains(@class,'a-icon a-icon-star-small a-star-small')]");
	
	public ProductPage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		this.driver=driver;
		this.wait=wait;
	}
	
	public void sortBy() {
		sendInfo(driver.findElement(sortBy),"Price: Low to High");
	}
	
	public void selectItem() {
		ArrayList<WebElement> list=new ArrayList<WebElement>();
		list=(ArrayList<WebElement>) driver.findElements(itemRating);
		//performHoverAndClick(list.get(0).findElement(By.xpath("./parent::a/parent::span/parent::div/parent::div/preceding-sibling::div//span")));
		list.get(0).findElement(By.xpath("//i[@class='a-icon a-icon-popover']")).click();
	}
}
