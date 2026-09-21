package webtesting;
/*
 Launch Chrome web browser
 Open URL
 Validate Title
 Close Browser
 */

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
	    String actual_title=driver.getTitle();
		
		if(actual_title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	   driver.close();
	   
	   
	   /*	String actual_title=driver.getTitle();
		
		if(actual_title.equals("Google"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();*/
		
		
	}

}
