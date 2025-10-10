   package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By LoginFormHeading = By.xpath("//div[@class='login-form']/h2");

	By EmailInput = By.xpath("//div[@class='login-form']/form/input[@name='email']");
	By PasswordInput = By.name("password");
	By LoginBtn = By.xpath("//*[text()='Login']");

	//div[@class='shop-menu pull-right']/ul/li[10]/a
	//a[i[contains(@class,'user')]]
	By LoggedInUser = By.xpath("//a[i[contains(@class,'user')]]");
	
	By IncorrectCredentialsErrorMsg = By.xpath("//div[@class='login-form']/form/p");

	By Logout = By.partialLinkText("Logout");
	
	public String getLoginFormHeading() {
		return driver.findElement(LoginFormHeading).getText();
	}

	public void LoginToAccountInput(String Email, String Password) {
		driver.findElement(EmailInput).sendKeys(Email);
		driver.findElement(PasswordInput).sendKeys(Password);
	}

	public void ClickLogin() {
		driver.findElement(LoginBtn).click();
	}
	
	public String getLoggedInUser() {
		return driver.findElement(LoggedInUser).getText();
	}
	
	public String getIncorrectCredentialsError() {
		return driver.findElement(IncorrectCredentialsErrorMsg).getText();
	}
	
	public void ClickLogout() {
		driver.findElement(Logout).click();
	}
}
