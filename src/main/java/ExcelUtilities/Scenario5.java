package ExcelUtilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import utilities.Constants;
import utilities.Launcher;

public class Scenario5 {
	public void read_Excel() {
		
		File file = new File(Constants.ExcelFile2);
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFRow row=sh.getRow(1);
			XSSFCell cell;
			DataFormatter format=new DataFormatter();   
			for(int i=0;i<=5;i++) {
			cell=row.getCell(i);
			System.out.println(format.formatCellValue(cell));
			/*CellType type = cell.getCellType();
			switch(type) {
			case STRING: System.out.println(row.getCell(i).getStringCellValue());
			             break;
			case NUMERIC: System.out.println(row.getCell(i).getNumericCellValue());
			              break;
			}*/
			
			}
			
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
