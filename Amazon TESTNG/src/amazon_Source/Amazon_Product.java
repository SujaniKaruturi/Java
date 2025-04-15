package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product 
{
	ChromeDriver driver;
	@FindBy(id="buy-now-button") WebElement buynow;
	@FindBy(id="add-to-cart-button") WebElement addtocart;
	@FindBy(id="add-to-wishlist-button-submit") WebElement wishlist;
	@FindBy(xpath="(//span[.='Continue shopping'])[4]") WebElement continue_shopping;
	@FindBy(name="proceedToRetailCheckout") WebElement proceedtobuy;
	@FindBy(linkText="View Your List") WebElement viewyourlist;
public void wishlist()
{
	wishlist.click();
	//continue_shopping.click();
	viewyourlist.click();
}
public void buy_Now()
{
	buynow.click();
}
public void add_ToCart()
{
	addtocart.click();
	proceedtobuy.click();
}
public Amazon_Product(ChromeDriver driver)		//parameterized constructor 
{
	PageFactory.initElements(driver,this);
}

	
}
