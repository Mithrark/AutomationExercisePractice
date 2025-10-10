package tests.contact;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import utils.Base_Test;

public class TC06_ContactUsTest extends Base_Test{

	ContactUsPage contactUsPage;

	@BeforeMethod
	public void Setup() {

		contactUsPage = new ContactUsPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void ContactUsForm() {

		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		
		contactUsPage.ClickContactUs();
		
		Assert.assertEquals(contactUsPage.getTextGetInTouch(), "GET IN TOUCH");
		
		contactUsPage.FormFill("Mithra", "test762@gmail.com", "Test Subject", "Test Message", "C:\\\\Users\\\\mithra.r.k\\\\OneDrive - Accenture\\\\Desktop\\\\test.txt");
		
		contactUsPage.SubmitClick();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Assert.assertEquals(contactUsPage.getSuccessMsg(), "Success! Your details have been submitted successfully.");
		
		contactUsPage.HomeBtnClick();
	}
	
}
