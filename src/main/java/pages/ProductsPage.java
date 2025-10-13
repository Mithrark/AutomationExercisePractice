package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver=driver;
	}

	By ProductsLink = By.xpath("//a[contains(text(),'Products')]");
	By AllProductsText = By.xpath("//div[@class='features_items']/h2[contains(text(),'All Products')]");

	//final for View Product- //div/p[contains(text(),'Blue Top')]/ancestor::div[@class='product-image-wrapper']//div[@class='choose']/ul/li/a
	//replace product name - get all product names and select which view product to be selected

	String ViewProduct = "//div/p[contains(text(),'%s')]/ancestor::div[@class='product-image-wrapper']//div[@class='choose']/ul/li/a";

	//All Products
	By ProductNames = By.xpath("//div[@class='productinfo text-center']/p");

	//All Products price based on product name - Products page(before)
	//div[@class='productinfo text-center']/p[contains(text(),'Blue Top')]/preceding-sibling::h2 
	String productPricesWName = "//div[@class='productinfo text-center']/p[contains(text(),'%s')]/preceding-sibling::h2";

	//Product details page
	String getProductname = "//div/h2[contains(text(),'%s')]";
	//div[@class='product-information']/h2

	//Category in Product details page
	By CategoryText = By.xpath("//div[@class='product-information']/p");

	//Product price in Product details page
	By ProductPrice = By.xpath("//div[@class='product-information']/span/span");

	//Availability in Product details page
	By Availability = By.xpath("//div[@class='product-information']/p[2]");

	//Condition in Product details page
	By Condition = By.xpath("//div[@class='product-information']/p[3]");
	
	//Brand in Product details page
	By Brand = By.xpath("//div[@class='product-information']/p[4]");
	
	//Search product input
	By SearchInput = By.name("search");
	
	//Search button
	By Searchbtn = By.id("submit_search");
	
	//Searched product text
	By SearchedProductTxt = By.xpath("//*[@class='title text-center']");
	
	//Products visible
	String Products = "//div[@class='productinfo text-center']/p[contains(text(),'%s')]";
	
	public void ClickProducts() {
		driver.findElement(ProductsLink).click();
	}

	public String getAllProductsText() {
		return driver.findElement(AllProductsText).getText();
	}

	public By getViewProduct(String ProductName) {
		return By.xpath(String.format(ViewProduct, ProductName));
	}

	public void ClickViewProduct(String Productname) {
		driver.findElement(getViewProduct(Productname)).click();
	}

	// Get all product names as text
	public List<String> getProductNames() {

		List<WebElement> nameElements = driver.findElements(ProductNames);
		List<String> names = new ArrayList<>();

		for (WebElement nameElement : nameElements) {     
			names.add(nameElement.getText());
		}

		return names;
	}

	//Product Name in Product details page
	public By getProductName(String ProductName) {
		return By.xpath(String.format(getProductname, ProductName));
	}
	public String VerifyProductNameText(String ProductName) {
		return driver.findElement(getProductName(ProductName)).getText();
	}

	//Product Prices using product name - Products page(before)
	public By ProductPrice(String ProductName) {
		return By.xpath(String.format(productPricesWName, ProductName));
	}
	public String getPrice(String ProductName) {
		return driver.findElement(ProductPrice(ProductName)).getText();
	}

	//Category in product details page
	public String getCategoryText() {
		return driver.findElement(CategoryText).getText().replace("Category: ", "");
	}
	
	//Product price in Product details page
	public String ProductPriceText() {
		return driver.findElement(ProductPrice).getText();
	}
	
	//Availability in Product details page
	public String getAvailabilityText() {
		return driver.findElement(Availability).getText().replace("Availability: ", "");
	}
	
	//Condition in Product details page
	public String getConditionText() {
		return driver.findElement(Condition).getText().replace("Condition: ", "");
	}
	
	//Brand in Product details page
	public String getBrandText() {
		return driver.findElement(Brand).getText().replace("Brand: ", "");
	}
	
	
	//Search product
	public void SearchProduct(String Product) {
		
		driver.findElement(SearchInput).sendKeys(Product);
		
		driver.findElement(Searchbtn).click();
	}
	
	//get Searched Product text
	public String getSearchedProductTxt() {
		return driver.findElement(SearchedProductTxt).getText();
	}
	
	//Products visible as per search
	public By SearchedProduct(String SearchName) {
		return By.xpath(String.format(Products, SearchName));
	}
	public String getSearchedProduct(String SearchName) {
		return driver.findElement(SearchedProduct(SearchName)).getText();
	}
}
