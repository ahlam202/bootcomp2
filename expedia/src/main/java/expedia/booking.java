package expedia;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class booking {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\projects\\expedia\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\eclipse-workspace\\projects\\expedia\\drivers\\msedgedriver.exe");
		driver=new ChromeDriver();
		//driver=new EdgeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Flights")).click();
	    driver.findElement(By.xpath("//*[@aria-label=\"Leaving from\"]")).click();
		WebElement depart=driver.findElement(By.id("location-field-leg1-origin"));
		depart.sendKeys("austin");
		//Thread.sleep(6000);
		for (int i = 0; i < 1; i++) {
			depart.sendKeys(Keys.DOWN);
		}
		driver.findElement(By.xpath("//*[@aria-label=\"Austin (AUS - Austin-Bergstrom Intl.)\"]")).click();
		
		driver.findElement(By.xpath("//*[@aria-label=\"Going to\"]")).click();
		WebElement arrvl = driver.findElement(By.id("location-field-leg1-destination"));
		arrvl.sendKeys("new");
		//Thread.sleep(6000);
		for (int i = 0; i < 1; i++) {
			arrvl.sendKeys(Keys.DOWN);
		}
		driver.findElement(By.xpath("//*[@aria-label=\"New York (JFK - John F. Kennedy Intl.)\"]")).click();
		driver.findElement(By.id("d1-btn")).click();
	   // Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@aria-label=\"Feb 14, 2022\"]")).click();
	    //Thread.sleep(6000);
	    driver.findElement(By.xpath("//*[@aria-label=\"Feb 25, 2022\"]")).click();	
		driver.findElement(By.xpath("//*[@data-stid=\"apply-date-picker\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Search\"]")).click();
		
		driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/main/div/div[2]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-test-id=\"select-link\"])[1]")));
		driver.findElement(By.xpath("(//*[@data-test-id=\"select-link\"])[1]")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@aria-label=\"Select Basic Economy for $138\"]")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("(//*[@data-test-id=\"select-link\"])[1]")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@aria-label=\"Select Basic Economy for $138\"]")).click();
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
	ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles()); 
		driver.switchTo().window(tabs.get(1));
		driver.manage().deleteAllCookies();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@aria-label=\"Continue to checkout\"]")).click();
		
		driver.findElement(By.id("firstname[0]")).sendKeys("ahlam");
		driver.findElement(By.id("lastname[0]")).sendKeys("larg");
		driver.findElement(By.id("phone-number[0]")).sendKeys("1234567890");
		driver.findElement(By.id("gender_female[0]")).click();
		WebElement month=driver.findElement(By.id("date_of_birth_month0"));
		month.click();
		Select sl= new Select(month);
		sl.selectByValue("12");
		WebElement day =driver.findElement(By.id("date_of_birth_day[0]"));
		day.click();
		Select sle= new Select(day);
		sle.selectByValue("25");
		WebElement year =driver.findElement(By.id("date_of_birth_year[0]"));
		year.click();
		Select slec= new Select(year);
		slec.selectByValue("1994");
		driver.findElement(By.xpath("//*[@id=\"yes_insurance\"]")).click();
		driver.findElement(By.id("creditCardInput")).sendKeys("123345566");
		WebElement monthCart=driver.findElement(By.name("creditCards[0].expiration_month"));
		monthCart.click();
		Select slCart= new Select(monthCart);
		slCart.selectByValue("1");
		WebElement yearCart=driver.findElement(By.name("creditCards[0].expiration_year"));
		yearCart.click();
		Select slCartY= new Select(yearCart);
		slCartY.selectByValue("2024");
		driver.findElement(By.xpath("//*[@name=\"creditCards[0].zipcode\"]")).sendKeys("987");
		driver.findElement(By.name("creditCards[0].street")).sendKeys("123 main street");
		driver.findElement(By.name("creditCards[0].city")).sendKeys("dallas");
		WebElement state=driver.findElement(By.name("creditCards[0].state"));
		state.click();
		Select s= new Select(state);
		s.selectByValue("LA");
		
		driver.findElement(By.xpath("//*[@name=\"creditCards[0].zipcode\"]")).sendKeys("86564");
		driver.findElement(By.xpath("//*[@data-validation-message=\"Please enter a valid email address.\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("complete-booking")).click();
		
		
				}

}
