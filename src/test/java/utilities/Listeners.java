package utilities;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Base)result.getInstance()).driver;
		Date dt= new Date();
		String st=dt.toString().replace(" ", "_").replace(":", "_");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  try {	
	  FileHandler.copy(source, new File(System.getProperty("user.dir")+"\\screenshots\\pass\\"+st+"capture.jpg"));
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Base) result.getInstance()).driver;	
		Date dt=new Date();
		String st=dt.toString().replace(" ", "_").replace(":", "_");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(source, new File(System.getProperty("user.dir")+"\\screenshots\\failed\\"+st+"capture.jpg"));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	
	
}
