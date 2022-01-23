package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.AddCart;
import pageObjects.HomePage;
import pageObjects.SelectProduct;
import utilities.Base;

public class TC_searchProduct_001 extends Base{
public static WebDriver driver;

@Test
public void AmazonProduct() throws IOException, InterruptedException {
	HomePage hp=new HomePage(Base.driver);
	hp.search();
	screenShot();
	hp.clickIcon();
	SelectProduct sp=new SelectProduct(Base.driver);
	sp.selectProd();
	Thread.sleep(6000);
	screenShot();
	AddCart ac= new AddCart(Base.driver);
	ac.addCart();
	screenShot();
	ac.cliclAdd();
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
