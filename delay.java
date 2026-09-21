import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelayExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(5000);  // Wait for 5 seconds

        driver.quit();
    }
}