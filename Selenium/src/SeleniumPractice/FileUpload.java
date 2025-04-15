package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\DELL\\Downloads\\MKT_Sample_PDF_for fileupload selenium.pdf");
		
		//Check using Robot class ,how to upload file?
	}

}
