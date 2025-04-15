package amazon_Test;
import java.util.Iterator;
import java.util.Set;

/*Scenario:
 Login--->Search-->Wishlist--->Buy now--->make Payment--->Credit card-->Logout
*/
import org.testng.annotations.Test;

import amazon_Source.Amazon_Home;
import amazon_Source.Amazon_Login;
import amazon_Source.Amazon_Payments;
import amazon_Source.Amazon_Product;
import amazon_Source.Amazon_SearchResult;

public class Amazon_Testcase1 extends Amazon_LaunchQuit
{
	@Test
	public void logintobookingcc()   //cc-credit card
	{
		Amazon_Login al= new Amazon_Login(driver);   
		al.userName();
		al.passWord();
		Amazon_Home ah=new Amazon_Home(driver);
		ah.search_Bag();
		Amazon_SearchResult as=new Amazon_SearchResult(driver);
		as.bag1();
			Set<String> parentandchild = driver.getWindowHandles();   // Set<String> ,set is interface. It will accept all string values inside particular Set
			Iterator<String> i=parentandchild.iterator(); //Iterator() is method to get parent and child id separately. Return type is String.(Iterator is Interface in collections )
			String parentid1 = i.next();		//first next method of iterator of string will always gives parent id.
			String Childid1 =  i.next();		//second next method of iterator of string will always gives child id.
			//System.out.println(parentid1);
			//System.out.println(Childid1);
			driver.switchTo().window(Childid1);	
		Amazon_Product ap=new Amazon_Product(driver);
		ap.buy_Now();
		Amazon_Payments apay=new Amazon_Payments(driver);
		apay.select_payment();
		driver.switchTo().frame("ApxSecureIframe");
		apay.credit_Card();
		driver.switchTo().defaultContent();    //To come out of iframe, we need to give this line.
		
	}

}
