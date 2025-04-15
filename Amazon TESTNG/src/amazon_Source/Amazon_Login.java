package amazon_Source;
//Inorder to not to get captcha for amazon login , 
//Login to amazon manually in guest mode and keep the tab open and then run ur automation code to login to amamzon.
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login
{
	ChromeDriver driver;   //helps to launch any browser
	//1. Locating each element with @Findby annotation.
	//@FindBy(xpath="//input[@name='email']")  	WebElement username;
	@FindBy(id="ap_email") WebElement username2;
	@FindBy(id="continue") WebElement continue_button;
	@FindBy(id="ap_password") 	 	WebElement password;
	@FindBy(id="signInSubmit") 	 	WebElement signin_button;
	//@FindBy(xpath = "//input[@id='signInSubmit']") 	WebElement signin_button;
	
	// 2. Creating separate methods for each component.(We will perform action of the component) 
	public void userName()
	{
		username2.sendKeys("9494913532");
		//username2.sendKeys("sujaninalla11@gmail.com");
		continue_button.click();
	}
	public void passWord()
	{	
		password.sendKeys("Tejasrii722");
		signin_button.click();
	}
	
	//3. Initializing the elements with the help of page factory class.
	public Amazon_Login(ChromeDriver driver)		//parameterized constructor 
	{
		PageFactory.initElements(driver,this);
	}




}
