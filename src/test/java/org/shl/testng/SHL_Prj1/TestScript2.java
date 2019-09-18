package org.shl.testng.SHL_Prj1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Product;
import utilities.Constants;
import utilities.Initialiser;
import utilities.WaitExpectedConditions;
public class TestScript2 extends Initialiser
{
	@Test
	public void TestPages() 
	{    
		homePage.CancelModal();
		homePage.mouseHover();
		cameraPage.addtoCompare(Constants.NUMBER_OF_ELEMENTS);
		cameraPage.ClickCompare();
		comparePage.makeComparison(Constants.NUMBER_OF_ELEMENTS);
	}
	
}
