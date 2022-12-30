package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver = null;
	
	public ExcelUtility elib = new ExcelUtility();
	public FileUtility flib = new FileUtility();
	public JavaUtility jlib = new JavaUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	
	public static WebDriver sDriver;
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("database connection");
	}
	
	@BeforeTest
	@Parameters("browser")
	public void beforetest(String browser) throws Throwable {
		System.out.println("test running");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("use-fake-ui-for-media-stream");
			driver=new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("edgedriver")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options=new EdgeOptions();
		
			driver=new EdgeDriver(options);
		}else{
			driver= new ChromeDriver();
		}
		wlib.waitForPageToLoad(driver);
		sDriver=driver;
		wlib.maximaizethebrowser(driver);
		
		driver.manage().deleteAllCookies();
	}
	
	@BeforeClass()
	
	public void beforeclass() throws Throwable {
		System.out.println("class is running");
		
		//https://demoqa.com/
		
	}
		
	@AfterClass()
	public void afterclass() throws InterruptedException {
		System.out.println("class is close");
		Thread.sleep(5000);
		//driver.close();
	}
		
	@AfterTest
	public void aftertest() {
		System.out.println("test close");
	}
	
	@AfterSuite()
	public void aftersuite() {
		System.out.println("close the database connection");
	}
}


