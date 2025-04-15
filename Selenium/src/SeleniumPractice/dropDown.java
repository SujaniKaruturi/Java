package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException
	{
/*
		ChromeDriver j =new ChromeDriver(); 
		j.get("file:///C:/Users/DELL/Downloads/MKT%20HTML%20Page.html");
		j.manage().window().maximize(); 
		WebElement Dropdown = j.findElement(By.id("Relegion"));   //Religion dropdown
		
		Select k = new Select(Dropdown);
		//k.selectByVisibleText("Christian");
		//k.selectByValue("3");
		k.selectByIndex(3);
		Thread.sleep(3000);
		j.quit();
*/
		ChromeDriver j =new ChromeDriver();
		j.get("https://www.amazon.in/");
		j.manage().window().maximize(); 
		//WebElement dd= j.findElement(By.name("url"));    //we can use either name or id= 'searchDropdownBox' locator
		WebElement dd= j.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select k = new Select(dd);
		//k.selectByVisibleText("Amazon Fashion");
		//k.selectByValue("search-alias=freshmeat");
		k.selectByIndex(6);   //Amazon pharmacy
		Thread.sleep(3000);
		j.quit();
		
	}

}
