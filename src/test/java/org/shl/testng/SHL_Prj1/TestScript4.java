package org.shl.testng.SHL_Prj1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ExcelUtilities.ReadExcel;
import ExcelUtilities.WriteExcel;
import utilities.Constants;
import utilities.Launcher;

public class TestScript4 extends Launcher {
	WebDriver driver;
	WriteExcel writeExcel;
	ReadExcel readExcel;
	String[] data;
   
		@Test
	public void testExcel() throws Exception {
		
		writeExcel = new WriteExcel();
		writeExcel.createExcel(Constants.DATA_ARRAY1);
		readExcel = new ReadExcel();
		data = readExcel.read_Excel(2);
		driver = launchBrowser(data[0]);
		driver.get(data[1]);
	}
}
