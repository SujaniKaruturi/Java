package amazon_Test;
/*Scenario:
Login--->Search-->Wishlist--->Add to cart--->make Payment--->Debit card-->Logout
*/
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import amazon_Source.Amazon_Home;
import amazon_Source.Amazon_Login;
import amazon_Source.Amazon_Payments;
import amazon_Source.Amazon_Product;
import amazon_Source.Amazon_SearchResult;

public class Amazon_Testcase2 extends Amazon_LaunchQuit
{

	@Test
	public void logintobookingdc() //dc-debit cart
	{
		Amazon_Login al= new Amazon_Login(driver);   
		al.userName();
		al.passWord();
		Amazon_Home ah=new Amazon_Home(driver);
		ah.search_novel();
		Amazon_SearchResult as=new Amazon_SearchResult(driver);
		as.novel2();
			Set<String> parentandchild = driver.getWindowHandles();   // Set<String> ,set is interface. It will accept all string values inside particular Set
			Iterator<String> i=parentandchild.iterator(); //Iterator() is method to get parent and child id separately. Return type is String.(Iterator is Interface in collections )
			String parentid1 = i.next();		//first next method of iterator of string will always gives parent id.
			String Childid1 =  i.next();		//second next method of iterator of string will always gives child id.
			//System.out.println(parentid1);
			//System.out.println(Childid1);
			driver.switchTo().window(Childid1);	
		Amazon_Product ap=new Amazon_Product(driver);
		ap.add_ToCart();
		Amazon_Payments apay=new Amazon_Payments(driver);
		apay.select_payment();
		apay.credit_Card();   //for debit card also same method
		
		
		
	}
}
