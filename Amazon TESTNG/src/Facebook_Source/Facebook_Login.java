package Facebook_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login
{
	ChromeDriver driver;
	@FindBy(id="email") WebElement fbusername;
	@FindBy(id="pass") WebElement fbpassword;
	@FindBy(name="login") WebElement submit;
	@FindBy(xpath="//input[@aria-label='Search Facebook']") WebElement searchFb;
	
	public void userName()
	{
		fbusername.sendKeys("sujaninalla11@gmail.com");
		fbpassword.sendKeys("Raviteja@3");
		submit.click();
	}
	
	public Facebook_Login(ChromeDriver driver)		//parameterized constructor 
	{
		PageFactory.initElements(driver,this);
	}
	
}
