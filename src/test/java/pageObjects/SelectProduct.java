package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	public WebDriver driver;
	
@FindBy(xpath = "//*[@alt=\"Apple iPhone 11 Pro, 64GB, Space Gray - Unlocked (Renewed Premium)\"]")	WebElement product;

public SelectProduct(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);		
}
public void selectProd() {
	product.click();
}		
	
	
}
