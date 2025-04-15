package Maven_MKT.Mock_Interview_Maven;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerPro implements ITestListener {
	static WebDriver driver;	//static becoz this class will be parent class for all other classes.
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase is passed");
		TakesScreenshot ts= (TakesScreenshot) driver;	//explicitly upcasting driver to TakesScreenshot Interface
		File source =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("D:\\S_Selenium\\Projects\\Mock_Interview_Maven\\Maven_ScreenShots\\Pass\\TC_Pass" + Math.random()+ ".png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase is failed");
		TakesScreenshot ts= (TakesScreenshot) driver;	//explicitly upcasting driver to TakesScreenshot Interface
		File source =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("D:\\S_Selenium\\Projects\\Mock_Interview_Maven\\Maven_ScreenShots\\Fail\\TC_Fail_" + Math.random()+ ".png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}


}
