package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\projects\\Amazon\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		WebElement SearchIcon1= driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon1.click();
		driver.findElement(By.xpath("//*[@alt=\"Apple iPhone 11 Pro, 64GB, Space Gray - Unlocked (Renewed Premium)\"]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//*[@id=\"attachSiAddCoverage\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
