package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerInformation {	
	public WebDriver driver;
	@FindBy(id  = "firstname[0]") WebElement firstN;
	@FindBy(id = "lastname[0]") WebElement lastN;
	@FindBy(id = "phone-number[0]") WebElement phone;
	@FindBy(id = "gender_female[0]") WebElement gender;
	@FindBy(id = "date_of_birth_month0") WebElement monthBirth;
	@FindBy(id = "date_of_birth_day[0]") WebElement dayBirth;
	@FindBy(id = "date_of_birth_year[0]") WebElement yearBirth;
	@FindBy(xpath = "//*[@id=\"yes_insurance\"]") WebElement insurance;
	@FindBy(id = "creditCardInput") WebElement creditC;
	@FindBy(name = "creditCards[0].expiration_month") WebElement monthCard;
	@FindBy(name = "creditCards[0].expiration_year") WebElement yearCard;
	@FindBy(xpath = "//*[@name=\"creditCards[0].zipcode\"]") WebElement zpcCard;
	@FindBy(name = "creditCards[0].street") WebElement street;
	@FindBy(name = "creditCards[0].city") WebElement city;
	@FindBy(name = "creditCards[0].state") WebElement state;
	@FindBy(xpath = "//*[@name=\"creditCards[0].zipcode\"]") WebElement zpc;
	@FindBy(xpath = "//*[@data-validation-message=\"Please enter a valid email address.\"]") WebElement email;
	@FindBy(id = "complete-booking") WebElement completeButt;
	
	
	public PassengerInformation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void firstName() {
		firstN.sendKeys("ahlam");
	}
	
	public void lastName() {
		lastN.sendKeys("larg");
	}
	public void phoneNumb() {
		phone.sendKeys("1234567890");
	}
	public void genderFem() {
		gender.click();
	}
	public void monthOfBirth() {
		monthBirth.click();
		Select sl= new Select(monthBirth);
		sl.selectByValue("12");
	}
	public void dayOfBirth() {
		dayBirth.click();
		Select sle= new Select(dayBirth);
		sle.selectByValue("25");
	}
	public void yearOfBirth() {
		yearBirth.click();
		Select slec= new Select(yearBirth);
		slec.selectByValue("1994");
	}
	public void insurBox() {
		insurance.click();
	}
	public void creditCard() {
		creditC.sendKeys("123345566");
	}
	public void monthCardExp() {
		monthCard.click();
		Select slCart= new Select(monthCard);
		slCart.selectByValue("1");
	}
	public void yearCardExp() {
		yearCard.click();
		Select slCartY= new Select(yearCard);
		slCartY.selectByValue("2024");
	}
	public void SecurityCode() {
		zpcCard.sendKeys("185");
	}
	public void BillingAddress() {
		street.sendKeys("123 main street");
	}
	public void cityAdd () {
		city.sendKeys("dallas");
	}
	public void stateAdd() {
		state.click();
		Select s= new Select(state);
		s.selectByValue("LA");
	}
	public void zipCode() {
		zpc.sendKeys("65973");
	}
	public void emailAdd() {
	   email.sendKeys("abc@gmail.com");
	}
	public void completeBookingButt() {
		completeButt.click();
	}
	
	
}
