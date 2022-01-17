package components;

import java.time.Clock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;
import components.LogIn;

public class Header extends WebDriverManager{
	private WebDriver driver;
	
	//Selectors
	private static By logInButtonBy = By.cssSelector("[data-test='user-space']");

	private static int TIME_OUT = 5;

	/**
	 * Constructor for Header.
	 * @param driver
	 */
	 public Header (WebDriver driver) {
			this.driver = driver;
		}
	 
	 /**
	  * Click on login button to go to the login page.
	  * @return logIn
	  */
	 public LogIn clicklogInButton() {
         logger.info("Click on LogIn button");
         WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
         logger.debug("Wait for the item " + logInButtonBy );
         WebElement logInButton = wait.until(ExpectedConditions.elementToBeClickable(logInButtonBy));
         logInButton.click();
         logger.info("Clicked on LogIn button");
         LogIn logIn = new LogIn(driver);
         return logIn;
     }
	
	 
}
 