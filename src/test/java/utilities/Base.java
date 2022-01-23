package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public static WebDriver driver;
public Properties prop;

@BeforeMethod
public void initializeDriver() throws IOException {
	
prop=new Properties();
FileInputStream fis= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\projects\\Amazon\\data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
String urll=prop.getProperty("url");
		   
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(urll);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}else if(browserName.equalsIgnoreCase("edge"))  {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") +"/drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get(urll);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}else {
			System.out.println("wrong browser entred");
		}

	}
		@AfterMethod
	public void teardown() {
		driver.close();
	}
		
		
	public void screenShot() throws IOException {
		Date dt= new Date();
		String st=dt.toString().replace(" ", "_").replace(":", "_");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(source, new File(System.getProperty("user.dir")+"\\screenshots\\"+st+"capture.jpg"));
	}
	
	
	
	
	
	
	
	
	
}
