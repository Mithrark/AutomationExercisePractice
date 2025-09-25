package tests.login;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import utils.Base_Test;
import utils.ConfigReader;

public class TC05_RegisterExistingEmailTest extends Base_Test {
	HomePage homePage;
	SignupPage signupPage;
	LoginPage loginPage;

	@BeforeMethod
	public void Setup(){

		homePage = new HomePage(driver);
		signupPage = new SignupPage(driver);
		loginPage = new LoginPage(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	@Test(priority=1)
	public void RegisterUser()  {

		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		homePage.SignupLoginClick();	
		
		Assert.assertEquals(signupPage.getSignupFormHeading(), "New User Signup!");
		
		signupPage.Signup(ConfigReader.User_Name_01, ConfigReader.EMAIL_01);
		signupPage.SignupBtnClick();
		
		Assert.assertEquals(signupPage.getEmailAlreadyExistMsg(), "Email Address already exist!");
	}
}
