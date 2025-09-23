package tests.login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignupPage;
import utils.Base_Test;

public class TC01_RegisterUserTest extends Base_Test {

	HomePage homePage;
	SignupPage signupPage;

	@BeforeMethod
	public void Setup(){

		homePage = new HomePage(driver);
		signupPage = new SignupPage(driver);

	}
	
	@Test
	public void SignupLogin() {
		homePage.SignupLoginClick();		
		signupPage.Signup("Test Name", "test23839@gmail.com");
		
	}
	
	@Test
	public void EnterDetails() {
		
		signupPage.EnterAccountInfo("Test@123", "04", "01", "1999");
		signupPage.FirstLastName("Anne", "Doe");
		signupPage.Company("ABC Corp");
		signupPage.Address("238, t street", "26, Street");
		signupPage.Country("India");
	}
}
