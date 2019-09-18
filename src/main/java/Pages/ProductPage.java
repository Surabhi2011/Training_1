package Pages;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;
import utilities.WaitExpectedConditions;

public class ProductPage extends BaseClass{
	private WebDriver driver;
	private WebDriverWait wait;
    WaitExpectedConditions condition;
    private By waitPage=By.xpath("//span[text()='Filters']");
	public ProductPage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		this.driver=driver;
		this.wait=wait;

	}
    
    
    //get the highest ratings among all ratings
	 
    public int getHighestRating() 
    {
		
        waitCondition(WaitExpectedConditions.VISIBILITY_OF_ELEMENT_LOCATED,waitPage,driver,10);
		//wait.until(ExpectedConditions.titleIs("Earphones - Buy Products Online at Best Price in India - All Categories | Flipkart.com"));
		ArrayList<WebElement> rating=new ArrayList<WebElement>();
		rating=(ArrayList<WebElement>) driver.findElements(By.className("_38sUEc"));
		int highestrating=0;
		int numrating;
		for(int k=0;k<rating.size();k++) {
			numrating=Integer.parseInt(rating.get(k).getText().replace("(","").replace(",","").replace(")", "").trim());
			if(numrating>highestrating) {
				
				highestrating=numrating;
			}
		}
		return highestrating;
	}

	//Get the product name and start rating of product with highest Rating
	
    public void getRatings(int highestrating) {

		ArrayList<WebElement> list=new ArrayList<WebElement>();
		list=(ArrayList<WebElement>) driver.findElements(By.xpath("//div[@data-id]"));
		String ProductName;
		int NumberOfRatings;
		float starrating;
		for(WebElement product:list) {
			ProductName=product.findElement(By.xpath(".//a[@title]")).getText();

			try{
				NumberOfRatings=Integer.parseInt(product.findElement(By.xpath(".//*[contains(text(),'(')]")).getText().replace("(","").replace(",","").replace(")", "").trim());	}
			catch(Exception e) {
				NumberOfRatings=0;
			}
			try{
				starrating=Float.parseFloat(product.findElement(By.className("hGSR34")).getText());
			}
			catch(Exception e) {
				starrating=0;
			}

			if(NumberOfRatings==highestrating) {
				System.out.println("Product Name: "+ProductName+"\nProduct Ratings: "+NumberOfRatings+"\nProduct StarRating: "+starrating);
			}

		}
	}
}
