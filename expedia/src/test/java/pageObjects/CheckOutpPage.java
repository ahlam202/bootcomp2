package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutpPage {
	public WebDriver driver;
	@FindBy(xpath = "//*[@aria-label=\"Continue to checkout\"]") WebElement checkOut;
	
	
	
	public CheckOutpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void checkOutButt() {
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles()); 
		driver.switchTo().window(tabs.get(1));
		checkOut.click();
	}
	
	
	
	
	
	
}
