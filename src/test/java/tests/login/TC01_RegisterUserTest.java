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

public class TC01_RegisterUserTest extends Base_Test {

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

		signupPage.EnterAccountInfo(ConfigReader.PASSWORD_01, "14", "November", "1999");
		signupPage.FirstLastName("Anne", "Doe");
		signupPage.Company("ABC Corp");
		signupPage.Address("238, t street", "26, Street");
		signupPage.Country("United States");
		signupPage.StateCity("Test", "Test", "282781");
		signupPage.Mobile("9837628812");

		signupPage.CreateAccount();

		Assert.assertEquals(signupPage.getAccountCreatedMsg(), "ACCOUNT CREATED!");

		signupPage.ContinueBtnClick();

		Assert.assertEquals(loginPage.getLoggedInUser(), "Logged in as "+ConfigReader.User_Name_01);

	}

	@Test(priority=2, enabled=false)
	public void DeleteAccount() {

		signupPage.DeleteAccountBtnClick();

		Assert.assertEquals(signupPage.getAccountDeletedMsg(), "ACCOUNT DELETED!");

		signupPage.ContinueBtnClick();

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/");
	}
}
