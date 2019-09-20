package org.shl.testng.SHL_Prj1;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AmazonPages.HomePage;
import AmazonPages.ProductPage;
import utilities.Constants;
import utilities.Initialiser;

public class TestScript3 extends Initialiser {
	@BeforeClass
	public void makeObjects() {
		driver.get(Constants.URL2);
		amazonHomePage= new HomePage(driver, wait);
		amazonProductPage=new ProductPage(driver,wait);
	}
  @Test
  public void TestThirdScenario(Method method) {
	  amazonHomePage.search(Constants.MOBILE,method.getName());
	  amazonProductPage.sortBy();
	  amazonProductPage.selectItem();
	 
  }
}
