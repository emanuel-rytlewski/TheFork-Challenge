package components;

import java.time.Clock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.WebDriverManager;

public class MyProfile extends WebDriverManager{
	
	//Selectors 
	private static By firstNameFieldBy = By.name("firstName");
	private static By lastNameFieldBy = By.name("lastName");
	private static By phoneNumberFieldBy = By.name("phoneNumber.nationalNumber");

	private static int TIME_OUT = 5;
	
	/**
	 * Constructor for MyProfile.
	 * @param driver
	 */
	public MyProfile (WebDriver driver) {
		this.driver = driver;
	}
	 
	/**
	 * Get a string of first name field.
	 * @return String
	 */
	public String getFirstName() {
		logger.info("Get the name of name field");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item" + firstNameFieldBy);
		wait.until(ExpectedConditions.presenceOfElementLocated(firstNameFieldBy));
		logger.info("Got the name from the name field");
		return driver.findElement(firstNameFieldBy).getText();		
	}
	
	/**
	 * Get a string of last name field.
	 * @return String
	 */
	public String getLastName() {
		logger.info("Get the last name of last name field");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item" + lastNameFieldBy);
		wait.until(ExpectedConditions.presenceOfElementLocated(lastNameFieldBy));
		logger.info("Got the last name from the last name field");
		return driver.findElement(lastNameFieldBy).getText();		
	}
	
	/**
	 * Get a string of phone number field.
	 * @return String
	 */
	public String getPhoneNumber() {
		logger.info("Get the phone number of phone number field");
		WebDriverWait wait = new WebDriverWait(driver,TIME_OUT);
		logger.debug("Wait for the item" + phoneNumberFieldBy);
		wait.until(ExpectedConditions.presenceOfElementLocated(phoneNumberFieldBy));
		logger.info("Got the phone number from the phone number field");
		return driver.findElement(phoneNumberFieldBy).getText();
	}
}