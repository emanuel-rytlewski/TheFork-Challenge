package driver;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class WebDriverManager {
	protected WebDriver driver;
	protected static final Logger logger = LogManager.getLogger(WebDriverManager.class);
	protected ExtentReports extent = new ExtentReports();
	protected ExtentSparkReporter testReport = new ExtentSparkReporter("test-output/testReport.html");
	protected ExtentTest test = extent.createTest("Login to https://www.thefork.com/,enter to my profile "
			+ "and validate my personal information");
	 LocalDate time = LocalDate.now(); 
	 long startTime;
	 long delta;
	 public void deltaTime(){
		 long currentTime = System.currentTimeMillis();
		 delta = currentTime - startTime;
	 }
	 
	 @Parameters({"Port"})
	 @BeforeMethod
	 public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	 		driver.navigate().to("https://www.thefork.com/");
	 		logger.info("Opened https://www.thefork.com/ in chrome navigator");
	 		
	    }	

	 public void initiateDriver(String Port) throws MalformedURLException {
     
		 if(Port.equalsIgnoreCase("9001")){
			 driver = new RemoteWebDriver(new URL("http:127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
			 driver.manage().window().maximize();
		 }
		 else if(Port.equalsIgnoreCase("9002")){
			 driver = new RemoteWebDriver(new URL("http:127.0.0.1:4444/wd/hub"), DesiredCapabilities.firefox());
			 driver.manage().window().maximize();
		 }
	 }
	 
	 @AfterMethod
	 public void tearDown(ITestResult result) {
		 System.out.println("The test "+result.getMethod().getDescription()+"(1= The test passed successfully - 2= The test did not pass successfully) turned out: "+result.getStatus());
		 driver.close();
		 driver.quit();
	 }

}
