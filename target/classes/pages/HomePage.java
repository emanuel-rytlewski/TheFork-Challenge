package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import components.Header;
import driver.WebDriverManager;
import helpers.Helper;

public class HomePage extends WebDriverManager {
	private WebDriver driver;
	//components
	private Header header;
	
	private static int TIME_OUT = 5;
	
	/**
	 * Constructor of HomePage
	 * @param driver
	 */
	public HomePage (WebDriver driver) {
		 logger.info("Initializing home page");
		this.driver = driver;
	}
	
	public Header header() { return header;}
}
