package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browserutilits.BrowserSetUp;
import readexcel.ReadExceldata;

public class MainPage 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
	BrowserSetUp br = new BrowserSetUp();
	driver = br.browserSetup();
	ReadExceldata rd = new ReadExceldata(driver);
	driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys(rd.getdata(0, 1, 1));
	driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys(rd.getdata(0, 1, 2));
		//driver.findElement(By.id("name")).sendKeys(rd.getData(0,1,1));
		
		//driver.findElement(By.id("pass")).sendKeys(rd.getData(0,1,2));
	
	
	driver.close();
	
}
}
