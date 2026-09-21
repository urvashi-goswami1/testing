import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
String expected = "Selenium Java";

driver.findElement(By.name("q"))
      .sendKeys(expected + Keys.ENTER);

Thread.sleep(3000);

String title = driver.getTitle();

if (title.contains(expected)) {
    System.out.println("PASS");
} else {
    System.out.println("FAIL");
}

driver.quit();
	}
}