package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class Compare extends BaseClass{
	WebDriver driver;
	WebDriverWait wait;
	public Compare(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		this.driver=driver;
		this.wait=wait;
	}
	//Prints the product name and price with lowest price
public void makeComparison(int size) {
	int price=0;
	int lowestprice=10000;
	String LowProduct="";
	String Product="";
	for(int i=2;i<=size+1;i++) {
		Product=driver.findElement(By.xpath("//*[@id=\"fk-compare-page\"]/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div["+i+"]")).getText();
		price=Integer.parseInt(driver.findElement(By.xpath("//div[2][@class='row']/div["+i+"]/div/div/div[1]")).getText().replace("₹","").replace(",", "").trim());
	    if(price<lowestprice) {
	    	lowestprice=price;
	    	LowProduct=Product;
	    }
	}
	System.out.println(LowProduct);
	System.out.println(lowestprice);
}
}
