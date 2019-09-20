package ExcelUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

/**
 * This class contains methods to create excel file and write on it at runtime
 * 
 * @author surabhi.srivastava
 *
 */
public class WriteExcel {
	String fileName;
	FileOutputStream fos;
	XSSFWorkbook workBook;
	XSSFRow row;
	XSSFSheet sheet;

	public WriteExcel() {
		fileName = Constants.EXCELFILE1;
		workBook = new XSSFWorkbook();
		sheet = workBook.createSheet("Sheet1");
	}

	/**
	 * This method writes on the excel file at runtime
	 * 
	 * @param 2-D Array : This data is to be written on Excel file
	
	 */
	
	public void createExcel(String [][] array) {
		try {
			for(int i=0;i<array.length;i++) {
				row=sheet.createRow(i);
				for(int j=0;j<array[0].length;j++) {
					row.createCell(j).setCellValue(array[i][j]);
				}
			}
			fos=new FileOutputStream(fileName);
			workBook.write(fos);
			fos.close();
		}
		catch(Exception e) {
			
		}
		
	}
}