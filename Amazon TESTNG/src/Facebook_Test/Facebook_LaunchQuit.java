package Facebook_Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Facebook_LaunchQuit {
	ChromeDriver driver;
	@BeforeMethod
	public void LaunchQuit()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		//Screenshot Code
		//TakesScreenshot ts= driver;    //upcasting
		//File fsource =ts.getScreenshotAs(OutputType.FILE);    //takes the screenshot
		//File fdest=new File("D:\\S_Selenium\\Projects\\Amazon TESTNG\\FbScenarios\\FB_Code_screenshot_" + Math.random() + ".png");
		//FileUtils.copyFile(fsource, fdest);
		//Thread.sleep(2000);
		//driver.quit();
		
	}
}
