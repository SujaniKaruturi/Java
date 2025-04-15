package Maven_MKT.Mock_Interview_Maven;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerPro.class)
public class Login_FB_Test extends ListenerPro {
	
	@Test(retryAnalyzer=Maven_MKT.Mock_Interview_Maven.RetryClassPro.class)
	public void loginTest()
	{	
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login_FB_Source l=new Login_FB_Source(driver);
		l.inputUsername("sujaninalla11@gmail.com");
		l.inputPassword("1234567");
		l.clickLogin();
		
		Assert.assertEquals(driver.getTitle(),"Log into Facebook");
		
	}
}
