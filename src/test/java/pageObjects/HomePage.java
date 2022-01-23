package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;


@FindBy(id = "twotabsearchtextbox") WebElement searchField;
@FindBy(id = "nav-search-submit-button") WebElement serchIcon;

public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);		
}
public void search() {
	searchField.sendKeys("iphone");
}
public void clickIcon() {
	serchIcon.click();
}	
	
	
	
	
	
	
	
}
