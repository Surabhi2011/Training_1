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

public class Initialiser {
    public WebDriver driver;
	public WebDriverWait wait;
	public CreateLog logfile=new CreateLog();
	public Launcher l_Browser;
	public String B_Name;
	public HomePage homePage;
	public ProductPage productPage;
	public Product cameraPage;
	public Compare comparePage;

	
   @BeforeClass
    public void LaunchBrowser() {
	   try {
    	l_Browser=new Launcher();
    	driver=l_Browser.launchBrowser("Chrome");
        driver.get(Constants.URL);}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	wait = new WebDriverWait(driver, 10);
    	homePage=new HomePage(driver,wait);
    	productPage=new ProductPage(driver,wait);
    	cameraPage=new Product(driver, wait);
    	comparePage=new Compare(driver,wait);
    }

	@AfterClass
	public void close() {
	driver.quit();
	}
}
