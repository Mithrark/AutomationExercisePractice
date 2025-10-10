package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
	}

	By ContactUs=By.xpath("//*[contains(text(),'Contact us')]");
	By GetInTouchText = By.xpath("//div[@class='contact-form']/h2[@class='title text-center']");
	//*[text()='Get In Touch']
	
	By NameInput = By.name("name");
	By EmailInput = By.name("email");
	By SubjectInput = By.name("subject");
	By MessageInput = By.name("message");
	By ChooseFileBtn = By.name("upload_file");
	
	By SubmitBtn = By.name("submit");
	
	By SuccessMsg = By.xpath("//*[contains(@class,'status alert')]");
	
	By HomeBtn = By.xpath("//span[contains(text(),'Home')]");
	
	public void ClickContactUs() {
		driver.findElement(ContactUs).click();
	}
	
	public String getTextGetInTouch() {
		return driver.findElement(GetInTouchText).getText();
	}
	
	public void FormFill(String Name, String Email, String Subject, String Message, String FilePath) {
		driver.findElement(NameInput).sendKeys(Name);
		driver.findElement(EmailInput).sendKeys(Email);
		driver.findElement(SubjectInput).sendKeys(Subject);
		driver.findElement(MessageInput).sendKeys(Message);
		
		driver.findElement(ChooseFileBtn).sendKeys(FilePath);;
	}
	
	public void SubmitClick() {
		driver.findElement(SubmitBtn).click();
	}
	
	public String getSuccessMsg() {
		return driver.findElement(SuccessMsg).getText();
	}
	
	public void HomeBtnClick() {
		driver.findElement(HomeBtn).click();
	}
}
