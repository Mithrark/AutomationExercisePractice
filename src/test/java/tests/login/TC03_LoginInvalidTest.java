package tests.login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.Base_Test;
import utils.ConfigReader;

public class TC03_LoginInvalidTest extends Base_Test{

	HomePage homePage;
	LoginPage loginPage;

	@BeforeMethod
	public void Setup() {

		homePage= new HomePage(driver);
		loginPage = new LoginPage(driver);
	}

	@Test
	public void InvalidAccountLogin() {

		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		
		homePage.SignupLoginClick();

		//Verify 'Login to your account' is visible
		Assert.assertEquals(loginPage.getLoginFormHeading(), "Login to your account");

		//Enter details
		loginPage.LoginToAccountInput(ConfigReader.EMAIL_02, ConfigReader.PASSWORD_02);

		//Click Login
		loginPage.ClickLogin();

		Assert.assertEquals(loginPage.getIncorrectCredentialsError(), "Your email or password is incorrect!");

	}
}
