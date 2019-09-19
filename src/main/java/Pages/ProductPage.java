package Pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseClass;
import utilities.WaitExpectedConditions;

/**
 * This class contains methods for second page of the POM for flipkart site
 * [first scenario]
 * 
 * @author surabhi.srivastava
 *
 */
public class ProductPage extends BaseClass {

	private WebDriver driver;
	private WebDriverWait wait;

	WaitExpectedConditions condition;

	String highestRatingText;

	private By waitPage = By.xpath("//span[text()='Filters']");

	public ProductPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;

	}

	/**
	 * This method gets the highest rating among all ratings and prints the product
	 * name, star rating and number of ratings
	 * 
	 * @param testName
	 */

	public void getHighestRating(String testName) {

		waitCondition(WaitExpectedConditions.VISIBILITY_OF_ELEMENT_LOCATED, waitPage, 10);

		int highestRating = 0;
		int currentRating;
		String currentRatingText;

		ArrayList<WebElement> rating = new ArrayList<WebElement>();
		rating = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//div//span[contains(@id,'productRating')]/following-sibling::span"));

		// gives the highest rating in text and integer format
		for (int k = 0; k < rating.size(); k++) {
			currentRatingText = rating.get(k).getText();
			currentRating = Integer
					.parseInt(rating.get(k).getText().replace("(", "").replace(",", "").replace(")", "").trim());
			if (currentRating > highestRating) {
				highestRatingText = currentRatingText;
				highestRating = currentRating;
			}

		}

		ArrayList<WebElement> list = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//span[contains(text(),'" + highestRatingText + "')]"));

		// prints the product name, star rating and number of ratings
		for (WebElement getRatings : list) {
			System.out.println(getRatings.findElement(By.xpath("./parent::div/preceding-sibling::a[1]")).getText());
			System.out.println(getRatings.findElement(By.xpath("./preceding-sibling::span")).getText());
			System.out.println(highestRating);
		}

		logfile.log(testName, "Get Highest Rating");

	}

	// Get the product name and start rating of product with highest Rating

	/*
	 * public void getRatings(int highestrating,String TestName) {
	 * 
	 * ArrayList<WebElement> list=new ArrayList<WebElement>();
	 * 
	 * list=(ArrayList<WebElement>)
	 * driver.findElements(By.xpath("//div[@data-id]")); String ProductName; int
	 * NumberOfRatings; float starrating; for(WebElement product:list) {
	 * ProductName=product.findElement(By.xpath(".//a[@title]")).getText();
	 * 
	 * try{ NumberOfRatings=Integer.parseInt(product.findElement(By.xpath(
	 * ".//*[contains(text(),'(')]")).getText().replace("(","").replace(",","").
	 * replace(")", "").trim()); } catch(Exception e) { NumberOfRatings=0; } try{
	 * starrating=Float.parseFloat(product.findElement(By.xpath(
	 * ".//span[contains(@id,'productRating')]")).getText()); } catch(Exception e) {
	 * starrating=0; }
	 * 
	 * if(NumberOfRatings==highestrating) {
	 * 
	 * System.out.println("Product Name: "+ProductName+"\nProduct Ratings: "
	 * +NumberOfRatings+"\nProduct StarRating: "+starrating);
	 * 
	 * 
	 * } logfile.log(TestName,"Get Ratings"); } }
	 */
}
