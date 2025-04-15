package Maven_MKT.Mock_Interview_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_FB_Source {    //Page Object Class
	WebDriver driver;
	
	@FindBy(id="email")  WebElement username;
	@FindBy(id="pass")  WebElement password;
	@FindBy(id="loginbutton")  WebElement login;
	
	public void inputUsername(String email)
	{
		username.sendKeys(email);
	}
	public void inputPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickLogin()
	{
		login.click();
	}
	public Login_FB_Source(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
}
