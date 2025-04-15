package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//29. Print all the links present in google home page.
//30. Print attribute value for particular name
public class S_29_30_All_Links_In_Google_Page {
	static void all_Links() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	int count =allLinks.size();
	System.out.println( "Count of all links is " + count);
	for(int i=0; i<count; i++)
	  { 
		  System.out.println(i + " Link with attribute value is  " + allLinks.get(i).getAttribute("href")); 
	  }
	for(int j=0;j<count;j++) 
	{
		WebElement a=  allLinks.get(j);
		String attributename=a.getAttribute("href");
		String attributevalue =a.getText();   //text of html page at particular index 
		System.out.println( "Attribute value " + attributevalue +" Attribute Name " + attributename );
		
	}
	}
	static void attribute_Value() throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	List<WebElement> allLinks= driver.findElements(By.tagName("a"));
	int count =allLinks.size();
	System.out.println( "Count of all links is " + count);
	for(int i=0; i<count; i++)
	  { 
		  System.out.println(i + " Class with attribute value is  " + allLinks.get(i).getAttribute("class")); 
	  }
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		all_Links();
		attribute_Value();
	}

}
