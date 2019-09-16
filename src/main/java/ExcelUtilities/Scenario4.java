package ExcelUtilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import utilities.Constants;
import utilities.Launcher;

public class Scenario4 {
public  void read_Excel() {
	WebDriver driver;
	File file = new File(Constants.ExcelFile1);
	try {
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row=sh.getRow(1);
		String Browser=row.getCell(0).getStringCellValue();
		String URL=row.getCell(1).getStringCellValue();
		System.out.println(URL);
		Launcher l_browser=new Launcher();
		driver=l_browser.launchBrowser(Browser);
		driver.get(URL);
		
		
}
	catch(Exception e) {
		System.out.println(e);
	}
}
  public void write_excel() {
	  
  }

}
