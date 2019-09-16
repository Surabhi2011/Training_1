package org.shl.testng.SHL_Prj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import utilities.BaseClass;
import utilities.Constants;
import utilities.Initialiser;
import utilities.Launcher;
import utilities.WaitExpectedConditions;

public class TestScript extends Initialiser {
	@Test
	public void TestPages() {
		homePage.CancelModal();
		homePage.search(Constants.EARPHONES);
		int highestRating=productPage.getHighestRating();
		productPage.getRatings(highestRating);
	}
}
