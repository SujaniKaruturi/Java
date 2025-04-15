package Facebook_Source;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Home 
{
	ChromeDriver driver;
	@FindBy(xpath="//div[@class='xi81zsa x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe']")  WebElement whatsonyourmind;
	@FindBy(xpath="//div[@class='xzsf02u x1a2a7pz x1n2onr6 x14wi4xw x9f619 x1lliihq x5yr21d xh8yej3 notranslate']") WebElement postInput;
	@FindBy(xpath="//span[text()='Only me']") WebElement Visible_OnlyMe;
	@FindBy(xpath="//div[@class='xu06os2 x1ok221b']//span[text()='Only me']") WebElement Select_onlyMe;
	@FindBy(xpath="//span[text()='Done']") WebElement done;
	@FindBy(xpath="//span[text()='Post']") WebElement post;
	
	
	public void wouMind()
	{
		whatsonyourmind.click();
		postInput.sendKeys("I am from India");
		Visible_OnlyMe.click();
		Select_onlyMe.click();
		done.click();
		post.click();
		
	}
	
	public Facebook_Home(ChromeDriver driver)		//parameterized constructor 
	{
		PageFactory.initElements(driver,this);
	}
}
