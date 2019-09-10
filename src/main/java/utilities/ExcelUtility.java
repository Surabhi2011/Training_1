package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
   public void readExcel() throws Exception {
	   File f=new File(Constants.EXCELFILE);
	   FileInputStream fis=new FileInputStream(f);
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet sh=wb.getSheet("Sheet1");
	   
   }
}
