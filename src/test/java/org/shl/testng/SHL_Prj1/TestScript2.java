package org.shl.testng.SHL_Prj1;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Compare;
import Pages.HomePage;
import Pages.Product;
import utilities.Constants;
import utilities.Initialiser;
import utilities.WaitExpectedConditions;

/**
 * This is the test script for second scenario
 * @author surabhi.srivastava
 *
 */
public class TestScript2 extends Initialiser {
	@BeforeClass
	public void makeObjects() {
		homePage = new HomePage(driver, wait);
		cameraPage = new Product(driver, wait);
		comparePage = new Compare(driver, wait);
	}

	@Test
	public void TestSecondScenario(Method method) {
		try {
			homePage.cancelModal(method.getName());
			homePage.mouseHover(method.getName());
			cameraPage.addToCompare(Constants.NUMBER_OF_ELEMENTS, method.getName());
			cameraPage.clickCompare(method.getName());
			comparePage.makeComparison(Constants.NUMBER_OF_ELEMENTS, method.getName());
		} catch (Exception e) {
			logfile.log(method.getName(), e.toString());
		}

	}
}
