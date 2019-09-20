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

/**
 * This class contains method to read from excel
 * 
 * @author surabhi.srivastava
 *
 */
public class ReadExcel {
	File file;
	FileInputStream fis;
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String[] data;

	public ReadExcel() {
		try {
			this.file = new File(Constants.EXCELFILE1);
			this.fis = new FileInputStream(file);
			this.workBook = new XSSFWorkbook(fis);
			this.sheet = workBook.getSheet("Sheet1");
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	/**
	 * This method returns array of values to be read from excel file
	 * 
	 * @return
	 */
	public String[] read_Excel(int size) {
		try {
			data=new String[size];
			row = sheet.getRow(1);
			for (int i = 0; i <size; i++) {
				cell = row.getCell(i);
				data[i] = cell.getStringCellValue();
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return data;
	}
}
