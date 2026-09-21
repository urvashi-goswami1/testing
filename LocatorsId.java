package webtesting;

import org.openqa.selenium.By;
/*
Locators
	id
	name
	class
	linktext
	partiallinktext

*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsId {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		/*
		//name
		driver.findElement(By.name("")).sendKeys(args);
		//id
		driver.findElement(By.id("")).isDisplayed();
		//class
		driver.findElement(By.name("")).sendKeys(args);
		*/
	//link text
	driver.findElement(By.linkText("Sporting Goods")).click();
		
	//partial link text
	driver.findElement(By.partialLinkText("Goods")).click();
		
}
}

