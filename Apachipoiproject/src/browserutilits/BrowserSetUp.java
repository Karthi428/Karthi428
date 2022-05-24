package browserutilits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp 


{
	WebDriver driver;
	public WebDriver browserSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2078130\\eclipse-workspace\\Apachipoiproject\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		return driver;
	}

}



