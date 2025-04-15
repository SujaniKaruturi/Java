package SeleniumPractice;
//Real way of automating sign in page of amazon.in
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) 
	{
		ChromeDriver j =new ChromeDriver();
		j.get("https://www.amazon.in/");
		j.manage().window().maximize(); 
		//WebElement hoverover = j.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement hoverover1 = j.findElement(By.xpath("//span[.='Hello, sign in']"));   //when we have text ,another way of writting xpath
		
		Actions h=new Actions(j);   //input parameter is Webdriver reference variable j
		h.moveToElement(hoverover1).perform();  //webelement hoverover1 to locate sign in element
		j.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();  
		//j.close();
		
	}

}
