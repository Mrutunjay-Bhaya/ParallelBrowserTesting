package genericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Its developed using Apache Poi libraries , which used to handle Microsoft Excel sheet .
 * @author CE121
 *
 */
public class ExcelUtility {
	/**
	 * Its used to read the data from excel sheet base on below argument
	 * @author sheetName
	 * @author rowNum
	 * @author celNum
	 * @return data
	 * @throws Throwable 
	 * 
	 */
		public String getDataFromExcel(String sheetName, int rowNum ,int celNum) throws Throwable
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/CIB_Regression_TC_Update(2).ods");
			Workbook wb = WorkbookFactory.create(fis);
			 Sheet sh = wb.getSheet("");
			Row row = sh.getRow(0);
			Cell cel = row.getCell(0);
			String data = cel.getStringCellValue();
			wb.close();
			return data;
			
		}
}