package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Pages.HomePage;
import Pages.ProductPage;
import Pages.Product;
import Pages.Compare;
import logs.CreateLog;

/**
 * This class initialises all the pages used in the test scenario, also it
 * launches the browser
 * 
 * @author surabhi.srivastava
 *
 */
public class Initialiser {
	public WebDriver driver;
	public WebDriverWait wait;
	public CreateLog logfile = new CreateLog();
	public Launcher l_Browser;
	public String B_Name;
	public HomePage homePage;
	public ProductPage productPage;
	public Product cameraPage;
	public Compare comparePage;

	@BeforeClass
	public void LaunchBrowser() {
		try {
			l_Browser = new Launcher();
			driver = l_Browser.launchBrowser("Chrome");
			driver.get(Constants.URL);
		} catch (Exception e) {
			System.out.println(e);
		}
		wait = new WebDriverWait(driver, 10);

	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
