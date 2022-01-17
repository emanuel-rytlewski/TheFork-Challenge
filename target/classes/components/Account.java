package components;
import java.time.Clock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;
import components.LogIn;

public class Account extends WebDriverManager{
	private WebDriver driver;
	
	//Selectors
	private static By personalInformationButtonBy = By.cssSelector("[aria-controls='user-space-user-information']");

	private static int TIME_OUT = 5;
	
    /**
     * Constructor for Account.
     * @param driver
     */
    public Account (WebDriver driver) {
		this.driver = driver;
	}
 	
    /**
 	 * Click on personal information button.
 	 * @return myProfile
 	 */
	public MyProfile clickPersonalInformationButton() {
		logger.info("Click on pesonal information button");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item " + personalInformationButtonBy);
        WebElement logInButton = wait.until(ExpectedConditions.elementToBeClickable(personalInformationButtonBy));
        logInButton.click();
        logger.info("Clicked on pesonal information button");   
        MyProfile myProfile = new MyProfile(driver);
        return myProfile;
	}
	
 
}
