package amazon_Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Amazon_LaunchQuit 
{
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		//driver.get("https://amazon.in");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		//Screenshot Code
		TakesScreenshot ts= driver;    //upcasting
		File fsource =ts.getScreenshotAs(OutputType.FILE);    //takes the screenshot
		File fdest=new File("D:\\S_Selenium\\Projects\\Amazon TESTNG\\Screenshots\\Code_screenshot_" + Math.random() + ".png");
		FileUtils.copyFile(fsource, fdest);
		
		Thread.sleep(2000);
		//driver.quit();
		
	}

}
