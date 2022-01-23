package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	public WebDriver driver;


	@FindBy(linkText = "Flights") WebElement flightTab;
	@FindBy(xpath = "//*[@aria-label=\"Leaving from\"]") WebElement leaving;
	@FindBy(id = "location-field-leg1-origin") WebElement depart;
	@FindBy(xpath = "//*[@aria-label=\"Austin (AUS - Austin-Bergstrom Intl.)\"]") WebElement austinPlace;
	@FindBy(xpath = "//*[@aria-label=\"Going to\"]") WebElement going;
	@FindBy(id = "location-field-leg1-destination") WebElement arriv;
	@FindBy(xpath = "//*[@aria-label=\"New York (JFK - John F. Kennedy Intl.)\"]") WebElement newYorkPlace;
	@FindBy(id = "d1-btn") WebElement caland;
	@FindBy(xpath = "//*[@aria-label=\"Feb 14, 2022\"]") WebElement deprtDat;
	@FindBy(xpath = "//*[@aria-label=\"Feb 25, 2022\"]") WebElement arrivDat;
	@FindBy(xpath = "//*[@data-stid=\"apply-date-picker\"]") WebElement doneButt;
	@FindBy(xpath = "//*[text()=\"Search\"]") WebElement searchButt;

	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public void flight() {
		flightTab.click();
	}
	public void leavingFrom() {
		leaving.click();
	}	
	public void departur() {
		depart.sendKeys("austin");
		for (int i = 0; i < 1; i++) {
			depart.sendKeys(Keys.DOWN);
		}
	}	
	public void placeD() {
		austinPlace.click();
	}	
	public void goingTo() {
		going.click();
	}	
	public void arrival() {
		arriv.sendKeys("new");
		for (int i = 0; i < 1; i++) {
			arriv.sendKeys(Keys.DOWN);
		}
	}	
	public void placeA() {
		newYorkPlace.click();
	}	
	public void calandre() {
		caland.click();
	}	
	public void departDate() {
		deprtDat.click();
	}	
	public void arrivDate() {
		arrivDat.click();
	}	
	public void donButton() {
		doneButt.click();
	}	
	public void searchbutton() {
		searchButt.click();
	}	
	
}
