package org.shl.testng.SHL_Prj1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ExcelUtilities.ReadExcel;
import ExcelUtilities.WriteExcel;
import utilities.Constants;
import utilities.Launcher;

public class TestScript5 extends Launcher {
	WebDriver driver;
	WriteExcel writeExcel;
	ReadExcel readExcel;
	String[] data;
   
		@Test
	public void testExcel() throws Exception {
		
		writeExcel = new WriteExcel();
		writeExcel.createExcel(Constants.DATA_ARRAY2);
		readExcel = new ReadExcel();
		data = readExcel.read_Excel(4);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
}