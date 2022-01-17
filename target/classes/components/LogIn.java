package components;

import java.time.Clock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class LogIn extends WebDriverManager{
	private WebDriver driver;
	
	//Selectors
	private static By eMailFieldBy = By.id("identification_email");
	private static By continueButtonEmailBy = By.cssSelector("[data-testid='checkout-submit-email']");
	private static By passwordFieldBy = By.id("password");
	private static By continueButtonPasswordBy = By.cssSelector("[data-testid='submit-password']");

	private static int TIME_OUT = 5;
	
	/**
	 * Constructor of LogIn.
	 * @param driver
	 */
	public LogIn (WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Enter E-mail.
	 * @param eMail
	 * @return LogIn
	 */
	public LogIn enterEMail (String eMail) {
		logger.info("Enter E-Mail");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item" + eMailFieldBy);
        WebElement eMailField = wait.until(ExpectedConditions.presenceOfElementLocated(eMailFieldBy));
        eMailField.click();
        eMailField.sendKeys(eMail);
        logger.info("Entered E-mail: " + eMail);
        return this;
	}
	
	/**
	 * Clicks on the continue button to go to the password.
	 * @return LogIn
	 */
	public LogIn ContinueToPassword() {
		logger.info("Click to continue button");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item " + continueButtonEmailBy);
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueButtonEmailBy));
        continueButton.click();
        logger.info("Clicked to continue button");       
        return this;
	}
	
	/**
	 * Enter password.
	 * @param password
	 * @return LogIn
	 */
	public LogIn enterPassword(String password) {
		logger.info("Enter password ");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Espera el elemento"+passwordFieldBy);
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(passwordFieldBy));
        passwordField.click();
        passwordField.sendKeys(password);
        logger.info("Entered passord: "+password);
        return this;
	}
	
	/**
	 * Clicks on the continue button to go to the account page.
	 * @return account
	 */
	public Account goToAccount() {
		logger.info("Click to continue button");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item " + continueButtonPasswordBy);
        WebElement ContinueButton = wait.until(ExpectedConditions.elementToBeClickable(continueButtonPasswordBy));
        ContinueButton.click();
        logger.info("Clicked to continue button");  
        Account account = new Account(driver);
        return account;
	}  
}
