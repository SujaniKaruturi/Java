package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home 
{
	ChromeDriver driver;
	@FindBy(id="twotabsearchtextbox") WebElement searchTextField;
	@FindBy(id="nav-search-submit-button") WebElement search_Button;
	public void search_Bag()
	{
		searchTextField.sendKeys("American Tourist");
		search_Button.click();
	}
	public void search_novel()
	{
		searchTextField.sendKeys("Novels");
		search_Button.click();
	}
	public void search_Dress()
	{
		searchTextField.sendKeys("Dresses");
		search_Button.click();
	}
	public void search_Toy()
	{
		searchTextField.sendKeys("Toys");
		search_Button.click();
	}
	public void search_Bottle()
	{
		searchTextField.sendKeys("Bottle");
		search_Button.click();
	}
	
	public Amazon_Home(ChromeDriver driver)		//parameterized constructor 
	{
		PageFactory.initElements(driver,this);
	}
	
}

