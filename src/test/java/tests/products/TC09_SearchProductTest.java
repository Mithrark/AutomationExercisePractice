package tests.products;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.ProductsPage;
import utils.Base_Test;

public class TC09_SearchProductTest extends Base_Test {

	ProductsPage productsPage;

	@BeforeMethod
	public void Setup() {

		productsPage = new ProductsPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void SearchProduct() {

		Assert.assertEquals(driver.getTitle(), "Automation Exercise");

		productsPage.ClickProducts();

		Assert.assertEquals(productsPage.getAllProductsText(), "ALL PRODUCTS");
		
		String SearchProduct[] = {"Maxi"};
		
		productsPage.SearchProduct(SearchProduct[0]);
		
		Assert.assertEquals(productsPage.getSearchedProductTxt(), "SEARCHED PRODUCTS");
		
		System.out.println("Product: "+productsPage.getSearchedProduct(SearchProduct[0]));
		

	}

}
