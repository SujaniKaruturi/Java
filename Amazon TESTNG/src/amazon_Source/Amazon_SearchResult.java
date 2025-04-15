package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult 
{
	ChromeDriver driver;
	@FindBy(xpath="(//img[@class='s-image'])[1]") WebElement search_Bag;  //search 1st bag
	@FindBy(xpath="(//img[@class='s-image'])[1]") WebElement search_Novel; 
	@FindBy(xpath="(//img[@class='s-image'])[1]") WebElement search_Dress; 
	@FindBy(xpath="(//img[@class='s-image'])[1]") WebElement search_Toy; 
	@FindBy(xpath="(//img[@class='s-image'])[1]") WebElement search_Bottle; 
	
public void bag1()
{
	search_Bag.click();
}
public void novel2()
{
	search_Novel.click();
}
public void dress3()
{
	search_Dress.click();	
}
public void toys4()
{
	search_Toy.click();
}
public void bottle5()
{
	search_Bottle.click();
}
public Amazon_SearchResult(ChromeDriver driver)		//parameterized constructor 
{
	PageFactory.initElements(driver,this);
}

}
