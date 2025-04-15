package Facebook_Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Facebook_Source.Facebook_Home;
import Facebook_Source.Facebook_Login;

public class Facebook_Scenario1 extends Facebook_LaunchQuit
{
	@Test
	public void FBlogin() throws InterruptedException
	{
		
		Facebook_Login fl =new Facebook_Login(driver);
		fl.userName();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();    //Way to resolve mandatory notifications to be closed once we login app
		ac.sendKeys(Keys.ESCAPE).build().perform();   //any one can be used
			
		Facebook_Home fh=new Facebook_Home(driver);
		fh.wouMind();
		Thread.sleep(5000);
	}
	
	
}
