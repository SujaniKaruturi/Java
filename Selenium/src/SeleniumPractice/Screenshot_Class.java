package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Class
{
//take a screenshot with current time and date
//try to take a screenshot in wrong location(means location which is not existing .i.e M driver)
	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		//System.out.println(Math.addExact(55, 88));
		//System.out.println(Math.subtractExact(88, 33));
		
		//System.out.println(Math.random());  //always produces unique value 
		
		
		TakesScreenshot ts= driver;    //upcasting
		File fsource =ts.getScreenshotAs(OutputType.FILE);    //takes the screenshot
		//File fdest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\screenshot_code.png");
		File fdest=new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\screenshot_code" + Math.random() + ".png");
		FileUtils.copyFile(fsource, fdest);
		
		driver.quit();   //before quitting the browser we need to take screenshot.
		
		

	}

}
