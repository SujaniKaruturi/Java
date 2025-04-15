package Facebook_Source;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_Profile 
{
	ChromeDriver driver;
	@FindBy(xpath="//div[@class='x6s0dn4 xkh2ocl x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z']") WebElement home;
	@FindBy(xpath="(//div[@class='xq8finb x16n37ib x1uuop16 x1fqkajt x1aj7aux x1axty5n']//div)[2]") WebElement likeButton;
	@FindBy(xpath="(//div[@class='xq8finb x16n37ib x1uuop16 x1fqkajt x1aj7aux x1axty5n']//div)[10]") WebElement commentButton;
	@FindBy(xpath="//p[@class='xdj266r x11i5rnm xat24cr x1mh8g0r'][1]") WebElement WriteComment;
	@FindBy(xpath="(//div[@class='x1i10hfl x1qjc9v5 xjqpnuy xa49m3k xqeqjp1 x2hbi6w x9f619 x1ypdohk xdl72j9 x2lah0s xe8uvvx x2lwn1j xeuugli x16tdsg8 x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1q0g3np x87ps6o x1lku1pv x1a2a7pz xjyslct xjbqb8w x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x972fbf xcfux6l x1qhh985 xm0m39n x3nfvp2 xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x3ajldb x194ut8o x1vzenxt xd7ygy7 xt298gk x1xhcax0 x1s928wv x10pfhc2 x1j6awrg x1v53gu8 x1tfg27r xitxdhh'])[18]") WebElement enter_Button;
	@FindBy(xpath="//div[@class='xqcrz7y x78zum5 x1qx5ct2 x1y1aw1k x1sxyh0 xwib8y2 xurb0ha xw4jnvo'][1]") WebElement Dots;
	@FindBy(xpath="//span[.='Move to bin']") WebElement movetobin;
	
	public void likePost() throws InterruptedException
	{
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));//old syntax, it will wait for 10 secs,to make sure the google page is fully loaded.
		//wait.until(ExpectedConditions.elementToBeClickable(home));
		home.click();
		likeButton.click();
		commentButton.click();
		WriteComment.sendKeys("Nice Post");
		enter_Button.click();
		
		
	}
	public void deletepost()
	{
		home.click();
		Dots.click();
		movetobin.click();
		
		
	}
	public Facebook_Profile(ChromeDriver driver)		//parameterized constructor 
	{
		PageFactory.initElements(driver,this);
	}

}
