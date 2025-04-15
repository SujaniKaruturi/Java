package Facebook_Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Facebook_Source.Facebook_Login;
import Facebook_Source.Facebook_Profile;

public class Facebook_Scenario3 extends Facebook_LaunchQuit
{
	@Test
	public void Facebook_DeletePost() throws InterruptedException
	{
		Facebook_Login fl =new Facebook_Login(driver);
		fl.userName();
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();    //Way to resolve mandatory notifications to be closed once we login app
		ac.sendKeys(Keys.ESCAPE).build().perform();  
		
		Facebook_Profile fp1=new Facebook_Profile(driver);
		fp1.deletepost();
	}

}
