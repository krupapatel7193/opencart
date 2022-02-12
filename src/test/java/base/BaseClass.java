package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentManager;
import utilities.Xls_Reader;

public class BaseClass {
	public static  WebDriver driver=null;;
	public static Properties pro;
	public ExtentReports rep = ExtentManager.getInstance();//to generate the report
	public static ExtentTest test;  //to generate log test step
	public static Logger app_logs = Logger.getLogger("qaLogs"); 
	public static Xls_Reader excel = null; 
	
	@BeforeSuite
	public static void Initialize() throws IOException{
		
		//load the property file 
		if(driver==null) {
	 pro = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		pro.load(fis);
		app_logs.debug("loading the config property file");
		String BrowserName = pro.getProperty("browser");
		String TestingUrl = pro.getProperty("url");
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			app_logs.debug("chrome browser launched");
		}
		else if(BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			app_logs.debug("IE browser launched");
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "C:\\Users\\krupap\\cucumber-work\\final\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			app_logs.debug("FireFox browser launched");
		}
		driver.get(TestingUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		}
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			driver.close();
		}
	}
	
}