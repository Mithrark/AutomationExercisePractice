package tests.login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.Base_Test;
import utils.ConfigReader;

public class TC02_LoginValidTest extends Base_Test{

	HomePage homePage;
	LoginPage loginPage;

	@BeforeMethod
	public void Setup(){

		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
			
	}
	
	@Test
	public void AccountLogin() {
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		
		homePage.SignupLoginClick();
		
		//Verify 'Login to your account' is visible
		Assert.assertEquals(loginPage.getLoginFormHeading(), "Login to your account");
				
		//Enter details
		loginPage.LoginToAccountInput(ConfigReader.EMAIL_01, ConfigReader.PASSWORD_01);
		
		//Click Login
		loginPage.ClickLogin();
		
		Assert.assertEquals(loginPage.getLoggedInUser(), "Logged in as "+ConfigReader.User_Name_01);

	}
	
}
