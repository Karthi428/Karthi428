package readexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExceldata
{

		WebDriver driver;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		public ReadExceldata(WebDriver driver)
		{	
			this.driver=driver;
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\2078130\\eclipse-workspace\\Apachipoiproject\\Datasource\\FillupDetailsxlsx.xlsx");

			workbook =  new XSSFWorkbook(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		public String getdata(int sheetNo,int row,int col)
		{
			sheet = workbook.getSheetAt(0);
			String data = sheet.getRow(row).getCell(col).getStringCellValue();
			return data;			
		}
		/*public int getRowcount(int sheetIndex)
		{
			int rowcount = workbook.getSheetAt(sheetIndex).getLastRowNum();
			rowcount = rowcount+1;
			return rowcount;
		}*/
	}

	

