package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base_Test {

	public WebDriver driver;

	@BeforeMethod
	public void setup(){
		
		
		ChromeOptions options = new ChromeOptions();
		String userProfile = "C:/Temp/ChromeProfile_" + System.currentTimeMillis();
		options.addArguments("--user-data-dir=" + userProfile);
		
		//to avoid password popup - using incognito
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/");
	}
	
	@AfterMethod
    public void tearDown() {
       /* if (driver != null) {
            driver.quit();
        }*/
    }
}
