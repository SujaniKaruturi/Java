package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement mobile=driver.findElement(By.linkText("Mobiles"));	
		Actions a=new Actions(driver);
		//a.doubleClick(mobile).perform(); 	//How to double click on any element? 
		Point xandy =mobile.getLocation();
		int x=xandy.getX();
		int y=xandy.getY();
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(3000);
		a.moveByOffset(x,y).click().perform();   //How to take ur mouse to any location and click on it. 
		
		
		
		
	}

}
