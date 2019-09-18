package org.shl.testng.SHL_Prj1;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import Pages.HomePage;
import Pages.ProductPage;
import utilities.BaseClass;
import utilities.Constants;
import utilities.Initialiser;
import utilities.Launcher;
import utilities.WaitExpectedConditions;

public class TestScript extends Initialiser {
	@BeforeClass
	public void MakeObjects() {
		homePage=new HomePage(driver,wait);
    	productPage=new ProductPage(driver,wait);
	}
	@Test
	public void TestFirstScenario(Method method) 
	{
		try {
		
		homePage.cancelModal(method.getName());
		homePage.search(Constants.EARPHONES,method.getName());
		int highestRating=productPage.getHighestRating(method.getName());
		productPage.getRatings(highestRating,method.getName());
		}
		catch(Exception e) {
			System.out.println(method.getName());
			logfile.log(method.getName(),e.toString());
		}
	}
}
