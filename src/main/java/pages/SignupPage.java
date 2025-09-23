package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By NameInput = By.name("name");
	By EmailInput = By.xpath("//div[@class='signup-form']/form/input[@name='email']");
	By SignupButton = By.xpath("//button[text()='Signup']");
	
	By Title = By.id("id_gender1");
	By PasswordInput = By.id("password");
	By Day = By.id("days");
	By Month = By.id("months");
	By Year = By.id("years");
	By NewsletterCheckbox = By.id("newsletter");
	By OffersCheckbox = By.id("optin");
	
	//Address Information
	By FirstName = By.id("first_name");
	By LastName = By.id("last_name");
	By CompanyInput = By.id("company");
	By Address1Input = By.id("address1");
	By Address2Input = By.id("address2");
	By CountryInput = By.id("country");
	By StateInput = By.id("state");
	By CityInput = By.id("city");
	By ZipcodeInput = By.id("zipcode");
	By MobileNumber = By.id("mobile_number");
	
	By CreateAccountBtn = By.xpath("//button[text()='Create Account']");
	
	public void Signup(String Name, String Email) {
		
		driver.findElement(NameInput).sendKeys(Name);		
		driver.findElement(EmailInput).sendKeys(Email);
		driver.findElement(SignupButton).click();
	}
	
	public void EnterAccountInfo(String Password, String day, String month, String year) {
		
		driver.findElement(Title).click();
		driver.findElement(PasswordInput).sendKeys(Password);
		
		driver.findElement(Day).sendKeys(day);
		driver.findElement(Month).sendKeys(month);
		driver.findElement(Year).sendKeys(year);
		
		driver.findElement(NewsletterCheckbox).click();
		driver.findElement(OffersCheckbox).click();
	}
	
	//Address Information
	
	public void FirstLastName(String First_Name,String Last_Name) {
		
		driver.findElement(FirstName).sendKeys(First_Name);
		driver.findElement(LastName).sendKeys(Last_Name);
		
	}
	
	public void Company(String Company) {
		
		driver.findElement(CompanyInput).sendKeys(Company);
	}
	
	public void Address(String Address1, String Address2) {
		
		driver.findElement(Address1Input).sendKeys(Address1);
		driver.findElement(Address2Input).sendKeys(Address2);
	}
	
	public void Country(String Country) {
		driver.findElement(CountryInput).sendKeys(Country);
	}
	
	public void StateCity(String State, String City, String Zipcode) {
		driver.findElement(StateInput).sendKeys(State);
		driver.findElement(CityInput).sendKeys(City);
		driver.findElement(ZipcodeInput).sendKeys(Zipcode);
	}
	
	public void Mobile(String Mobile) {
		
		driver.findElement(MobileNumber).sendKeys(Mobile);
	}
	
	public void CreateAccount() {
		driver.findElement(CreateAccountBtn).click();
	}
}
