package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	public WebDriver driver;
	
	
@FindBy(id = "add-to-cart-button")	WebElement clickCart;
@FindBy(xpath = "//*[@id=\"attachSiAddCoverage\"]")WebElement add;

public AddCart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);		
}	
public void addCart() {
	clickCart.click();
}
public void cliclAdd() {
	add.click();
}





}
