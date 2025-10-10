package tests.products;

import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ProductsPage;
import utils.Base_Test;

public class TC08_AllProductsTest extends Base_Test{

	ProductsPage productsPage;
	
	@BeforeMethod
	public void setUp() {
		
		productsPage = new ProductsPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void Products() {
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise");
		
		productsPage.ClickProducts();
		
		Assert.assertEquals(productsPage.getAllProductsText(), "ALL PRODUCTS");
		
		String ProductNames[] = productsPage.getProductNames().toArray(new String[0]);
		String ProductUsed = ProductNames[0];
			
		//get price of the product
		String ProductPricebefore = productsPage.getPrice(ProductUsed);
		
		//System.out.println("Product Price : "+ productsPage.getPrice(ProductUsed));
		
		productsPage.ClickViewProduct(ProductUsed);
		
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Product Details");
		
		//visible product name, category, price, availability, condition, brand
		//verify product name
		Assert.assertEquals(productsPage.VerifyProductNameText(ProductNames[0]), ProductUsed);
		
		//verify Category
		Assert.assertEquals(productsPage.getCategoryText(), "Women > Tops");
		
		//verify price
		Assert.assertEquals(productsPage.ProductPriceText(), ProductPricebefore);
		
		//verify availability
		Assert.assertEquals(productsPage.getAvailabilityText(), "In Stock");
		
		//verify condition
		Assert.assertEquals(productsPage.getConditionText(), "New");
		
		//verify Brand
		Assert.assertEquals(productsPage.getBrandText(), "Polo");
		
	}
	
}
