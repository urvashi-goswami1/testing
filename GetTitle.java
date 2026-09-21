package webtesting;

/*
Launch chrome web browser
Get Title, URL and code of the page
*/

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

		public class GetTitle {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
					
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				  
				System.out.println("Title of webpage is :" +driver.getTitle()); // fetch title of webpage
				  
				System.out.println("URL of webpage is : " +driver.getCurrentUrl()); // fetch url of webpage
				  
				System.out.println("Source Code of the page is : " +driver.getPageSource()); // fetching source code of webpage
				  
				System.out.println("test case passed");

				 }
			
	}


