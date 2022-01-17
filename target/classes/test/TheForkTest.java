package test;


import org.testng.annotations.Test;

import java.time.Clock;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import components.LogIn;
import components.MyProfile;
import driver.WebDriverManager;
import pages.HomePage;

public class TheForkTest extends WebDriverManager{
	@Test(
		groups = {"demo"},
		description = "Login in The Fork page and validate my personal information"
		  )
	public void test() {
		//Arrange 
		final String firstName="Emanuel";
		final String lastName="Rytlewski";
		final String phoneNumber="1156911006";
		final String eMail="emanuel.rytlewski@gmail.com";
		final String password="1156911006qA";
	
		//Act
		test.info("Enter to https://www.thefork.com/");
		HomePage homePage = new HomePage(driver);	
		
		test.info("Login and enter to my profile");
		MyProfile myProfile = homePage
		  .header()
		  .clicklogInButton()
		  .enterEMail(eMail)
		  .ContinueToPassword()
		  .enterPassword(password)
          .goToAccount()
          .clickPersonalInformationButton();
		
		test.info("Assert that the name is " + firstName);
		Assert.assertEquals(firstName,myProfile.getFirstName(),
        		"The name does not match");
		test.info("Assert that the last name is " + lastName);
		Assert.assertEquals(lastName,myProfile.getLastName(),
        		"The last name does not match");
		test.info("Assert that the phone number is " + phoneNumber);
		Assert.assertEquals(phoneNumber,myProfile.getPhoneNumber(),
        		"The cell phone number does not match");
		
	}	
}
