package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseFlight {
	public WebDriver driver;
	public WebDriverWait wait;
	@FindBy(xpath = "(//*[@data-test-id=\"select-link\"])[1]") WebElement departFlight;
	@FindBy(xpath = "(//*[text()=\"Select\"])[1]") WebElement select;
	@FindBy(xpath = "(//*[@data-test-id=\"select-link\"])[1]") WebElement returFlight;
	@FindBy(xpath = "//*[@aria-label=\"Select Basic Economy for $138\"]") WebElement select2;
	

	
	public ChooseFlight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public void departingFlight() {
	    wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-test-id=\"select-link\"])[1]")));
		departFlight.click();
	}
	public void selectButt() {
		select.click();
	}
	public void returningFlight() {
		returFlight.click();
	}
	public void selectButt2() {
		select2.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
