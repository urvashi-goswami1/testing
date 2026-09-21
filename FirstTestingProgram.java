package webtesting;

/*
Launch firefox web browser
Open URL

*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();		
        
		driver.get("https://www.google.com/");
        		
	}

}
