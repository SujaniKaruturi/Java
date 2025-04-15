package amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Payments 
{
	ChromeDriver driver;
	@FindBy(id="payChangeButtonId") WebElement cc_payment;  
	@FindBy(xpath="//span[.='Credit or debit card']") WebElement select_creditcard;
	@FindBy(xpath="//a[text()='Enter card details']") WebElement enter_creditcard_detials;
	@FindBy(name="addCreditCardNumber") WebElement CC_name;
	@FindBy(name="ppw-accountHolderName") WebElement nick_name;
	
	@FindBy(xpath="(//span[.='Net Banking'])[1]") WebElement select_nb;
	@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[1]") WebElement choose_option;
	
	@FindBy(xpath="(//span[@class='a-color-base a-text-bold'])[4]") WebElement otherUPI;
	@FindBy(name="__sif_encryptedVPA_collect") WebElement enter_UPI;
	@FindBy(xpath="(//span[.='Verify'])[3]") WebElement verify_UPI;
	
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent") WebElement usethispaymentmethod;
	@FindBy(xpath="(//span[.='Cash on Delivery/Pay on Delivery'])[3]") WebElement cashondelivery;
	//@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[1]") WebElement choose_option;
	//@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[1]") WebElement choose_option;
	
public void select_payment()
{
	select_creditcard.click();  //credit card
	enter_creditcard_detials.click();
	
}
public void credit_Card()
{
	CC_name.sendKeys("sujani");
	nick_name.sendKeys("Karuturi");
	
}
public void net_Banking()
{
	select_nb.click();
	Select k = new Select(select_nb);
	k.selectByIndex(2); 
	usethispaymentmethod.click();
}
public void payment_UPI()
{
	otherUPI.click();
	enter_UPI.sendKeys("9550336858@ybl");
	verify_UPI.click();
}
public void cashOnDelivery()
{
	cashondelivery.click();
}
public Amazon_Payments(ChromeDriver driver)		//parameterized constructor 
{
	PageFactory.initElements(driver,this);
}
	
}
